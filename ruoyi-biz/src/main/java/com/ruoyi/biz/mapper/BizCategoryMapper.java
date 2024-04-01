package com.ruoyi.biz.mapper;

import java.util.List;
import com.ruoyi.biz.domain.BizCategory;

/**
 * 分类Mapper接口
 * 
 * @author ruoyi
 * @date 2024-04-01
 */
public interface BizCategoryMapper 
{
    /**
     * 查询分类
     * 
     * @param categoryId 分类主键
     * @return 分类
     */
    public BizCategory selectBizCategoryByCategoryId(Long categoryId);

    /**
     * 查询分类列表
     * 
     * @param bizCategory 分类
     * @return 分类集合
     */
    public List<BizCategory> selectBizCategoryList(BizCategory bizCategory);

    /**
     * 新增分类
     * 
     * @param bizCategory 分类
     * @return 结果
     */
    public int insertBizCategory(BizCategory bizCategory);

    /**
     * 修改分类
     * 
     * @param bizCategory 分类
     * @return 结果
     */
    public int updateBizCategory(BizCategory bizCategory);

    /**
     * 删除分类
     * 
     * @param categoryId 分类主键
     * @return 结果
     */
    public int deleteBizCategoryByCategoryId(Long categoryId);

    /**
     * 批量删除分类
     * 
     * @param categoryIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBizCategoryByCategoryIds(Long[] categoryIds);
}
