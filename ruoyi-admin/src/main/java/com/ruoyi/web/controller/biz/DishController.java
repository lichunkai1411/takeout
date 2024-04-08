package com.ruoyi.web.controller.biz;

import com.ruoyi.biz.domain.Dish;
import com.ruoyi.biz.dto.*;
import com.ruoyi.biz.mapper.DishMapper;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.DictUtils;
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

    public DishController(DishMapper dishMapper) {
        this.dishMapper = dishMapper;
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
        startPage();
        List<DishListVo> list = dishMapper.selectDishList(param);
        return getDataTable(list);
    }

    @PreAuthorize("@ss.hasPermi('biz:dish:add')")
    @Log(title = "菜品管理", businessType = BusinessType.INSERT, operatorType = MANAGE)
    @ApiOperation("添加菜品")
    @PostMapping("/dishes")
    @Transactional
    public AjaxResult addDish(@Valid @RequestBody AddDishParam param) {
        // 获取用户所在店铺ID
        Long storeId = SecurityUtils.getLoginUser().getUser().getStoreId();
        Dish dish = new Dish();
        BeanUtils.copyProperties(param, dish);
        dish.setStoreId(storeId);
        dish.setCreateTime(DateUtils.getNowDate());
        dish.setCreateBy(SecurityUtils.getUsername());
        dishMapper.insertDish(dish);
        Long id = dish.getDishId();
        List<DishFlavorDTO> flavors = param.getFlavors();
        if (flavors != null && flavors.size() > 0) {
            flavors.forEach(dishFlavor -> dishFlavor.setDishId(id));
            dishMapper.insertDishFlavor(flavors);
        }
        return AjaxResult.success();
    }

    @PreAuthorize("@ss.hasPermi('biz:dish:edit')")
    @Log(title = "菜品管理", businessType = BusinessType.UPDATE, operatorType = MANAGE)
    @ApiOperation("修改菜品")
    @PutMapping("/dishes/{id}")
    public AjaxResult editDish(@PathVariable Long id, @Valid @RequestBody EditDishParam param) {
        Dish dish = dishMapper.selectDishByDishId(id);
        if (dish == null) {
            return AjaxResult.error("菜品不存在");
        }
        // 只能修改本店铺的菜品信息
        Long storeId = SecurityUtils.getLoginUser().getUser().getStoreId();
        if (!storeId.equals(dish.getStoreId())) {
            return AjaxResult.error("只能修改本店铺的菜品信息");
        }
        dish.setCategoryId(param.getCategoryId());
        dish.setDishName(param.getDishName());
        dish.setDishPrice(param.getDishPrice());
        dish.setDishImage(param.getDishImage());
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
    public AjaxResult remove(@RequestBody Long[] ids) {
        // 只能删除本店铺的菜品信息
        Long storeId = SecurityUtils.getLoginUser().getUser().getStoreId();
        dishMapper.deleteDishByIds(ids, storeId);
        dishMapper.deleteDishFlavorByIds(ids);
        return AjaxResult.success();
    }

    @PreAuthorize("@ss.hasPermi('biz:dish:edit')")
    @Log(title = "菜品管理", businessType = BusinessType.UPDATE, operatorType = MANAGE)
    @ApiOperation("售卖状态")
    @PutMapping("/dishes/{id}/saleStatus")
    public AjaxResult changeSaleStatus(@PathVariable Long id) {
        Dish dish = dishMapper.selectDishByDishId(id);
        if (dish == null) {
            return AjaxResult.error("菜品不存在");
        }
        // 只能修改本店铺的售卖状态
        Long storeId = SecurityUtils.getLoginUser().getUser().getStoreId();
        if (!storeId.equals(dish.getStoreId())) {
            return AjaxResult.error("只能修改本店铺的售卖状态");
        }
        String currentStatus = dish.getSaleStatus();
        String newSaleStatus = "起售".equals(currentStatus) ? "停售" : "起售";
        String newSaleStatusValue = DictUtils.getDictValue("biz_dish_status", newSaleStatus);
        dish.setSaleStatus(newSaleStatusValue);
        dish.setUpdateTime(DateUtils.getNowDate());
        dish.setUpdateBy(SecurityUtils.getUsername());
        dishMapper.updateDishSaleStatus(dish);
        return AjaxResult.success();
    }
}
