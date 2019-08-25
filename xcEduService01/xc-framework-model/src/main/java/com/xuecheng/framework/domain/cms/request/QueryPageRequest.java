package com.xuecheng.framework.domain.cms.request;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * @Auther: hekuan
 * @Date: 2019/7/26 0026 16:11
 * @Description:
 */
@Data
public class QueryPageRequest {
    //接受页面的查询条件

    //站点ID
    private String siteId;
    //页面ID
    private String pageId;
    //页面名称
    private String pageName;
    //别名
    private String pageAliase;
    //模版id
    private String templateId;
}
