package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import io.swagger.annotations.Api;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Description: description.
 * Author: FenG.
 * Create: 2019-01-17 19:57.
 */

public interface CmsPageRepository extends MongoRepository<CmsPage,String> {
    /**
     * description: 根据页面名称查询
     * @param pageName
     * @return com.xuecheng.framework.domain.cms.CmsPage
     */
    public CmsPage findByPageName(String pageName);

    //根据页面名称和类型查询
    CmsPage findByPageNameAndPageType(String pageName,String pageType);
    //根据站点和页面类型查询记录数
    int countBySiteIdAndPageType(String siteId,String pageType);
    //根据站点和页面类型分页查询
    Page<CmsPage> findBySiteIdAndPageType(String siteId, String pageType, Pageable pageable);

}
