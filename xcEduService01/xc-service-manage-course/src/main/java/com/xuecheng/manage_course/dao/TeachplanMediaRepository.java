package com.xuecheng.manage_course.dao;

import com.xuecheng.framework.domain.course.TeachplanMedia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Auther: hekuan
 * @Date: 2019/8/13 0013 21:42
 * @Description:
 */
public interface TeachplanMediaRepository extends JpaRepository<TeachplanMedia, String> {

    //根据课程id查询列表
    List<TeachplanMedia> findByCourseId(String courseId);
}

