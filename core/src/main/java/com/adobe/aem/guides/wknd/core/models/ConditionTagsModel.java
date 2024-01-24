package com.adobe.aem.guides.wknd.core.models;

import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = {SlingHttpServletRequest.class, Resource.class},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        adapters = {ConditionTagsModel.class, ComponentExporter.class},
        resourceType = {ConditionTagsModel.CONDITION_TAGS_RESOURCE_TYPE})
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class ConditionTagsModel implements ComponentExporter {

    protected static final String CONDITION_TAGS_RESOURCE_TYPE = "wknd/components/conditiontags";

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String description;

    @ValueMapValue
    private String conditionTags;

    @ValueMapValue
    private String conditionLabel;

    @ValueMapValue
    private String ctaText;

    @ValueMapValue
    private String ctaLink;

    @ValueMapValue
    private String linkTarget;
    

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getConditionTags() {
        return conditionTags;
    }

    public String getConditionLabel() {
        return conditionLabel;
    }

    public String getCtaText() {
        return ctaText;
    }

    public String getCtaLink() {
        return ctaLink;
    }

    public String getLinkTarget() {
        return linkTarget;
    }
   
    @Override
    public String getExportedType() {
        return ConditionTagsModel.CONDITION_TAGS_RESOURCE_TYPE;
    }
}
