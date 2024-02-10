package com.adobe.aem.guides.wknd.core.bean;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;


@Model(adaptables = {SlingHttpServletRequest.class, Resource.class},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class SpecialtyBean {

    @ValueMapValue
    private String specialtyTagPath;

    public String getSpecialtyTagPath() {
        return specialtyTagPath;
    }

}
