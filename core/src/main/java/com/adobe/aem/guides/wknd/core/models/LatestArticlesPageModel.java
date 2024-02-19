package com.adobe.aem.guides.wknd.core.models;

import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import com.day.cq.wcm.api.Page;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.Self;

import javax.annotation.PostConstruct;

@Model(adaptables = {SlingHttpServletRequest.class, Resource.class},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        adapters = {LatestArticlesPageModel.class, ComponentExporter.class},
        resourceType = {LatestArticlesPageModel.LAPAGE_RESOURCE_TYPE})
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class LatestArticlesPageModel implements ComponentExporter {

    protected static final String LAPAGE_RESOURCE_TYPE = "wknd/components/latest-article-page";

    @ScriptVariable
    private Page currentPage;

    private String cardType;
    private String articleImage;
    private String articleCategory;
    private String articleDescription;


    @PostConstruct
    private void initModel() {
        if (currentPage != null) {
            cardType = this.currentPage.getProperties().getOrDefault("cardType", StringUtils.EMPTY).toString();
            articleImage = this.currentPage.getProperties().getOrDefault("articleImage", StringUtils.EMPTY).toString();
            articleCategory = this.currentPage.getProperties().getOrDefault("articleCategory", StringUtils.EMPTY).toString();
            articleDescription = this.currentPage.getProperties().getOrDefault("articleDescription", StringUtils.EMPTY).toString();

        }
    }

    public String getCardType() {
        return cardType;
    }

    public String getArticleImage() {
        return articleImage;
    }

    public String getArticleCategory() {
        return articleCategory;
    }

    public String getArticleDescription() {
        return articleDescription;
    }

    @Override
    public String getExportedType() {
        return LatestArticlesPageModel.LAPAGE_RESOURCE_TYPE;
    }

}
