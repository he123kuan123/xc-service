package com.xuecheng.manage_course.dao;

import com.xuecheng.framework.domain.course.Teachplan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Auther: hekuan
 * @Date: 2019/8/1 0001 3:23
 * @Description:
 */
public interface TeachplanRepository extends JpaRepository<Teachplan,String> {
    //查询teachplan
    //  SELECT * FROM teachplan a WHERE a.`courseid`='4028e581617f945f01617f9dabc40000' AND a.`parentid`='0'

    public List<Teachplan> findByCourseidAndParentid(String courseId,String parentId);
}
