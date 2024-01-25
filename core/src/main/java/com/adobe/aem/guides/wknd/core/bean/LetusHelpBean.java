package com.adobe.aem.guides.wknd.core.bean;

import java.util.ArrayList;
import java.util.List;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = {SlingHttpServletRequest.class, Resource.class},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class LetusHelpBean {

    @ValueMapValue
    private String optionTitle;

    @ChildResource
    private List<SecondDropdownBean> optionTexts = new ArrayList<>();


    public String getOptionTitle() {
        return optionTitle;
    }

    public List<SecondDropdownBean> getOptionTexts() {
        return optionTexts;
    }

}
