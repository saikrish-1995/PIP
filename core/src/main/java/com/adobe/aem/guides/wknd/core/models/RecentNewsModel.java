package com.adobe.aem.guides.wknd.core.models;

import com.adobe.aem.guides.wknd.core.bean.InnerCarouselBean;
import com.adobe.aem.guides.wknd.core.bean.RecentNewsBean;
import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.ArrayList;
import java.util.List;

@Model(adaptables = {SlingHttpServletRequest.class, Resource.class},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        adapters = {RecentNewsModel.class, ComponentExporter.class},
        resourceType = {RecentNewsModel.RECENT_NEWS_RESOURCE_TYPE})
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class RecentNewsModel implements ComponentExporter {

    protected static final String RECENT_NEWS_RESOURCE_TYPE = "wknd/components/recentnews";


    @ChildResource
    private List<RecentNewsBean> recentNewsList = new ArrayList<>();

    @ValueMapValue
    private String viewAllLabel;

    @ValueMapValue
    private String redirectUrl;


    public List<RecentNewsBean> getRecentNewsList() {
        return recentNewsList;
    }


    public String getViewAllLabel() {
        return viewAllLabel;
    }


    public String getRedirectUrl() {
        return redirectUrl;
    }


    @Override
    public String getExportedType() {
        return RecentNewsModel.RECENT_NEWS_RESOURCE_TYPE;
    }

}
