package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsSite;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @Auther: hekuan
 * @Date: 2019/8/6 0006 5:53
 * @Description:
 */
public interface CmsSiteRepository extends MongoRepository<CmsSite,String> {
}
