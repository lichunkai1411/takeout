package com.ruoyi.web.controller.biz;

import com.ruoyi.biz.domain.Dish;
import com.ruoyi.biz.domain.DishFlavor;
import com.ruoyi.biz.domain.SetmealDish;
import com.ruoyi.biz.dto.*;
import com.ruoyi.biz.mapper.DishFlavorMapper;
import com.ruoyi.biz.mapper.DishMapper;
import com.ruoyi.biz.mapper.SetmealMapper;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.common.utils.bean.BeanUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;
import static com.ruoyi.common.enums.OperatorType.MANAGE;

@Api("菜品管理")
@RestController
@RequestMapping("/biz")
public class DishController extends BaseController {

    private final DishMapper dishMapper;
    private final DishFlavorMapper dishFlavorMapper;
    private final SetmealMapper setmealMapper;

    public DishController(DishMapper dishMapper, DishFlavorMapper dishFlavorMapper, SetmealMapper setmealMapper) {
        this.dishMapper = dishMapper;
        this.dishFlavorMapper = dishFlavorMapper;
        this.setmealMapper = setmealMapper;
    }

    @PreAuthorize("@ss.hasPermi('biz:dish:info')")
    @ApiOperation("获取菜品详情")
    @GetMapping("/dish/{id}")
    public AjaxResult getInfo(@PathVariable Long id) {
        return AjaxResult.success(dishMapper.selectDishByDishId(id));
    }

    @PreAuthorize("@ss.hasPermi('biz:dish:list')")
    @ApiOperation("获取菜品列表")
    @GetMapping("/dishes")
    public TableDataInfo getList(DishListParam param) {
        // 获取用户所在店铺ID
        Long storeId = SecurityUtils.getLoginUser().getUser().getStoreId();
        startPage();
        // 查询条件中的菜品名称需要通过category_id关联biz_category表进行匹配
        List<DishListVo> list = dishMapper.selectDishList(param, storeId);
        return getDataTable(list);
    }

    @PreAuthorize("@ss.hasPermi('biz:dish:add')")
    @Log(title = "菜品管理", businessType = BusinessType.INSERT, operatorType = MANAGE)
    @ApiOperation("添加菜品")
    @PostMapping("/dishes")
    @Transactional
    public AjaxResult addDish(@Valid @RequestBody AddDishParam param) {
        Dish dish = new Dish();
        BeanUtils.copyProperties(param, dish);
        dish.setSaleStatus("biz_sale_status_disable");
        dish.setCreateTime(DateUtils.getNowDate());
        dish.setCreateBy(SecurityUtils.getUsername());
        dishMapper.insertDish(dish);
        param.getDishFlavors().forEach(dishFlavorDTO -> {
            DishFlavor dishFlavor = new DishFlavor();
            dishFlavor.setDishId(dish.getDishId());
            BeanUtils.copyProperties(dishFlavorDTO, dishFlavor);
            dishFlavorMapper.insertDishFlavor(dishFlavor);
        });
        return AjaxResult.success();
    }

    @PreAuthorize("@ss.hasPermi('biz:dish:edit')")
    @Log(title = "菜品管理", businessType = BusinessType.UPDATE, operatorType = MANAGE)
    @ApiOperation("修改菜品")
    @PutMapping("/dishes/{id}")
    @Transactional
    public AjaxResult editDish(@PathVariable Long id, @Valid @RequestBody EditDishParam param) {
        Dish dish = dishMapper.selectDishByDishId(id);
        if (dish == null) {
            return AjaxResult.error("菜品不存在");
        }
        dishFlavorMapper.deleteDishFlavorByDishId(id);
        dish.setCategoryId(param.getCategoryId());
        dish.setDishName(param.getDishName());
        dish.setDishPrice(param.getDishPrice());
        dish.setDishImage(param.getDishImage());
        dish.setDescription(param.getDescription());
        dish.setUpdateTime(DateUtils.getNowDate());
        dish.setUpdateBy(SecurityUtils.getUsername());
        dishMapper.updateDish(dish);
        return AjaxResult.success();
    }

    @PreAuthorize("@ss.hasPermi('biz:dish:remove')")
    @Log(title = "菜品管理", businessType = BusinessType.DELETE, operatorType = MANAGE)
    @ApiOperation("批量删除")
    @DeleteMapping("/dishes")
    @Transactional
    public AjaxResult remove(@RequestBody DishIdsParam param) {
        // TODO 只能删除本店铺的菜品信息
        // TODO 起售状态不可删除  套餐关联的不可删除
        for (Long id : param.getIds()) {
            Dish dish = dishMapper.selectDishByDishId(id);
            if (dish.getSaleStatus().equals("biz_sale_status_enable")) {
                return AjaxResult.error("起售状态不可删除");
            }
        }
        List<SetmealDish> setmealDishes = setmealMapper.selectSetmealByDishIds(param.getIds());
        if (setmealDishes.size() > 0) {
            return AjaxResult.error("套餐关联的菜品不可删除");
        }
        dishMapper.deleteDishByIds(param.getIds());
        dishMapper.deleteDishFlavorByIds(param.getIds());
        return AjaxResult.success();

    }

    @PreAuthorize("@ss.hasPermi('biz:dish:editSaleStatus')")
    @Log(title = "菜品管理", businessType = BusinessType.UPDATE, operatorType = MANAGE)
    @ApiOperation("修改售卖状态")
    @PutMapping("/dishes/{id}/saleStatus")
    public AjaxResult editSaleStatus(@PathVariable Long id, @RequestBody EditSaleStatusParam param) {
        Dish dish = dishMapper.selectDishByDishId(id);
        if (dish == null) {
            return AjaxResult.error("菜品不存在");
        }
        dish.setSaleStatus(param.getSaleStatus());
        dish.setUpdateTime(DateUtils.getNowDate());
        dish.setUpdateBy(SecurityUtils.getUsername());
        dishMapper.updateDish(dish);
        return AjaxResult.success();
    }
}
