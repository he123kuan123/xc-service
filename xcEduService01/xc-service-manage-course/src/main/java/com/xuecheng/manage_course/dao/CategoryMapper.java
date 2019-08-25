package com.xuecheng.manage_course.dao;

import com.xuecheng.framework.domain.course.ext.CategoryNode;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Auther: hekuan
 * @Date: 2019/8/1 0001 7:07
 * @Description:
 */
@Mapper
public interface CategoryMapper {

    //查询分类
    public CategoryNode selectList();
}
