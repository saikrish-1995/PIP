package com.adobe.aem.guides.wknd.core.bean;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = {SlingHttpServletRequest.class, Resource.class},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class InnerCarouselBean {

    @ValueMapValue
    private String desktopImage;

    @ValueMapValue
    private String mobileImage;

    @ValueMapValue
    private String altText;

    @ValueMapValue
    private String redirectUrl;

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String description;

    
    public String getDesktopImage() {
        return desktopImage;
    }

    public String getMobileImage() {
        return mobileImage;
    }

    public String getAltText() {
        return altText;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

}
