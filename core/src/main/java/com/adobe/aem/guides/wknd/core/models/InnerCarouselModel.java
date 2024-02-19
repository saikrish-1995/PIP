package com.adobe.aem.guides.wknd.core.models;

import com.adobe.aem.guides.wknd.core.bean.InnerCarouselBean;
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
        adapters = {InnerCarouselModel.class, ComponentExporter.class},
        resourceType = {InnerCarouselModel.INNER_CAROUSEL_RESOURCE_TYPE})
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class InnerCarouselModel implements ComponentExporter {

    protected static final String INNER_CAROUSEL_RESOURCE_TYPE = "wknd/components/innercarousel";

    @ChildResource
    private List<InnerCarouselBean> innerCarousel = new ArrayList<>();

    @ValueMapValue
    private String next;

    @ValueMapValue
    private String prev;

    public List<InnerCarouselBean> getInnerCarousel() {
        return innerCarousel;
    }

    public String getNext() {
        return next;
    }

    public String getPrev() {
        return prev;
    }


    @Override
    public String getExportedType() {
        return InnerCarouselModel.INNER_CAROUSEL_RESOURCE_TYPE;
    }

}
