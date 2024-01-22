package com.adobe.aem.guides.wknd.core.models.impl;

import com.adobe.aem.guides.wknd.core.bean.FooterBean;
import com.adobe.aem.guides.wknd.core.models.Footer;
import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import com.drew.lang.annotations.NotNull;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.ArrayList;
import java.util.List;

@Model(adaptables = {SlingHttpServletRequest.class, Resource.class},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        adapters = {Footer.class, ComponentExporter.class},
        resourceType = {FooterImpl.FOOTER_RESOURCE_TYPE})
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class FooterImpl implements Footer {

    protected static final String FOOTER_RESOURCE_TYPE = "wknd/components/footer";

    @ScriptVariable
    private Resource resource;

    @ChildResource
    private List<FooterBean> firstColumnMenu = new ArrayList<>();

    @ChildResource
    private List<FooterBean> secondColumnMenu =new ArrayList<>();

    @ValueMapValue
    private String appdownloadtext;

    @ChildResource
    private List<FooterBean> appDownloadList =new ArrayList<>();

    @ValueMapValue
    private String socialMediaText;

    @ChildResource
    private List<FooterBean> socialMediaList =new ArrayList<>();

    @ValueMapValue
    private String copyRight;

    @ChildResource
    private List<FooterBean> legalleseLinks =new ArrayList<>();


    @Override
    public List<FooterBean> getFirstColumnMenu() {
        return firstColumnMenu;
    }

    @Override
    public List<FooterBean> getSecondColumnMenu() {
        return secondColumnMenu;
    }

    @Override
    public String getAppDownloadText() {
        return appdownloadtext;
    }

    @Override
    public List<FooterBean> getAppDownloadList() {
        return appDownloadList;
    }

    @Override
    public String getSocialMediaText() {
        return socialMediaText;
    }

    @Override
    public List<FooterBean> getSocialMediaList() {
        return socialMediaList;
    }

    @Override
    public String getCopyRight() {
        return copyRight;
    }

    @Override
    public List<FooterBean> getLegalleseLinks() {
        return legalleseLinks;
    }

    @NotNull
    @Override
    public String getExportedType() {
        return resource.getResourceType();
    }
}
