package com.ruoyi.web.controller.biz;

import com.ruoyi.biz.domain.Dish;
import com.ruoyi.biz.dto.*;
import com.ruoyi.biz.mapper.DishMapper;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

import static com.ruoyi.common.utils.PageUtils.startPage;

@Api("菜品管理")
@RestController
@RequestMapping("/biz")
public class DishController extends BaseController {

    private final DishMapper dishMapper;

    public DishController(DishMapper dishMapper) {
        this.dishMapper = dishMapper;
    }

    @ApiOperation("获取菜品详情")
    @GetMapping("/dish/{id}")
    public AjaxResult getInfo(@PathVariable Long id) {
        return AjaxResult.success(dishMapper.selectDishByDishId(id));
    }


    @ApiOperation("获取菜品列表")
    @GetMapping("/dishes")
    public TableDataInfo getList(DishListParam param) {
        startPage();
        List<DishListVo> list = dishMapper.selectDishList(param);
        return getDataTable(list);
    }

    @ApiOperation("添加菜品")
    @PostMapping("/dishes")
    public AjaxResult addDish(@Valid @RequestBody AddDishParam param) {
        Dish dish = new Dish();
        dish.setCategoryId(param.getCategoryId());
        dish.setDishName(param.getDishName());
        dish.setDishPrice(param.getDishPrice());
        dish.setDishImage(param.getDishImage());
        dish.setSaleStatus(param.getSaleStatus());
        dish.setCreateTime(DateUtils.getNowDate());
        dish.setCreateBy(SecurityUtils.getUsername());
        dishMapper.insertDish(dish);
        return AjaxResult.success();
    }

    @ApiOperation("修改菜品")
    @PutMapping("/dishes/{id}")
    public AjaxResult editDish(@PathVariable Long id ,@Valid @RequestBody EditDishParam param) {
        Dish dish = dishMapper.selectDishByDishId(id);
        if (dish == null) {
            return AjaxResult.error("菜品不存在");
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
    @ApiOperation("删除菜品")
    @DeleteMapping("/dishes/{id}")
    public AjaxResult remove(@PathVariable Long id) {
        dishMapper.deleteDishByDishId(id);
        return AjaxResult.success();
    }

    @ApiOperation("批量删除")
    @DeleteMapping("/dishes")
    public AjaxResult remove(@RequestBody Long[] ids) {
        dishMapper.deleteDishByDishIds(ids);
        return AjaxResult.success();
    }

    @ApiOperation("售卖状态")
    @PutMapping("/dishes/saleStatus/{id}")
    public AjaxResult changeSaleStatus(@PathVariable Long id) {
        Dish dish = dishMapper.selectDishByDishId(id);
        if (dish == null) {
            return AjaxResult.error("菜品不存在");
        }
        dish.setSaleStatus(dish.getSaleStatus().equals("1") ? "0" : "1");
        dish.setUpdateTime(DateUtils.getNowDate());
        dish.setUpdateBy(SecurityUtils.getUsername());
        dishMapper.updateDish(dish);
        return AjaxResult.success();
    }
}
