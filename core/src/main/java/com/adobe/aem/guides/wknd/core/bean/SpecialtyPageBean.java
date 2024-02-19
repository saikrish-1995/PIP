package com.adobe.aem.guides.wknd.core.bean;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;


@Model(adaptables = {SlingHttpServletRequest.class, Resource.class},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class SpecialtyPageBean {

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String description;

    @ValueMapValue
    private String learnMore;

    @ValueMapValue
    private String redirectUrl;

    @ValueMapValue
    private String browseDoctor;

    @ValueMapValue
    private String doctorPage;


    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }


    public String getLearnMore() {
        return learnMore;
    }


    public String getRedirectUrl() {
        return redirectUrl;
    }

    public String getBrowseDoctor() {
        return browseDoctor;
    }


    public String getDoctorPage() {
        return doctorPage;
    }

}
