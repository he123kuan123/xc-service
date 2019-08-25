package com.xuecheng.filesystem.dao;

import com.xuecheng.framework.domain.filesystem.FileSystem;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @Auther: hekuan
 * @Date: 2019/8/4 0004 18:03
 * @Description:
 */
//继承MongoRepository 参数为  模型数据类型 和 主键
public interface FileSystemRepository extends MongoRepository<FileSystem,String> {
}
