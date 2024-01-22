package com.adobe.aem.guides.wknd.core.models.impl;

import com.adobe.aem.guides.wknd.core.models.HeroBanner;
import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = {SlingHttpServletRequest.class, Resource.class},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        adapters = {HeroBanner.class, ComponentExporter.class},
        resourceType = {HeroBannerImpl.HERO_BANNER_RESOURCE_TYPE})
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class HeroBannerImpl implements HeroBanner {

    protected static final String HERO_BANNER_RESOURCE_TYPE = "wknd/components/hero-banner";

    @ScriptVariable
    private Resource resource;

    @ValueMapValue
    private String sectionTitle;

    @ValueMapValue
    private String sectionDescription;

    @ValueMapValue
    private String bannerDesktopImage;

    @ValueMapValue
    private String bannerMobileImage;

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String altText;

    @ValueMapValue
    private String link;

    @ValueMapValue
    private String linkTarget;

    @Override
    public String getBannerDesktopImage() {
        return bannerDesktopImage;
    }

    @Override
    public String getBannerMobileImage() {
        return StringUtils.isNotEmpty(bannerMobileImage) ? bannerMobileImage : bannerDesktopImage;
    }

    @Override
    public String getSectionTitle() {
        return sectionTitle;
    }

    @Override
    public String getSectionDescription() {
        return sectionDescription;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAltText() { return altText;  }

    @Override
    public String getLink() {
        return link;
    }

    @Override
    public String getLinkTarget() {
        return linkTarget;
    }

    @Override
    public String getExportedType() {
        return resource.getResourceType();
    }
}
