package com.adobe.aem.guides.wknd.core.models;


import com.adobe.aem.guides.wknd.core.bean.SpecialtyBean;
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
        adapters = {SpecialtyModel.class, ComponentExporter.class},
        resourceType = {SpecialtyModel.SPECIALITY_RESOURCE_TYPE})
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class SpecialtyModel implements ComponentExporter {

    protected static final String SPECIALITY_RESOURCE_TYPE = "wknd/components/specialty";

    @ValueMapValue
    private String placeholderText;

    @ChildResource
    private List<SpecialtyBean> specialty = new ArrayList<>();

    public String getPlaceholderText() {
        return placeholderText;
    }

    public List<SpecialtyBean> getSpecialty() {
        return specialty;
    }

    @Override
    public String getExportedType() {
        return SpecialtyModel.SPECIALITY_RESOURCE_TYPE;
    }

}
