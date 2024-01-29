package com.adobe.aem.guides.wknd.core.bean;

import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;
import java.text.SimpleDateFormat;
import java.util.Date;

@Model(adaptables = {SlingHttpServletRequest.class, Resource.class},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class RecentNewsBean {

    @ValueMapValue
    private String image;

    @ValueMapValue
    private String altText;

    @ValueMapValue
    private String newsTitleTag;

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String description;

    @ValueMapValue
    private Date newsDate;

    @ValueMapValue
    private String newsSource;

    @ValueMapValue
    private String readStoryLabel;

    @ValueMapValue
    private String readStoryLink;


    private String newsSourceDate;

    public String getImage() {
        return image;
    }

    public String getAltText() {
        return altText;
    }

    public String getNewsTitleTag() {
        return newsTitleTag;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getNewsSource() {
        return newsSource;
    }

    public String getNewsSourceDate() {
        return newsSourceDate;
    }

    public String getReadStoryLabel() {
        return readStoryLabel;
    }

    public String getReadStoryLink() {
        return readStoryLink;
    }


    @PostConstruct
    protected void init() {
        SimpleDateFormat formatter = new SimpleDateFormat( "dd MMM yyyy");

        newsSourceDate = null != newsDate ? formatter.format(newsDate) : StringUtils.EMPTY;
    }

}
