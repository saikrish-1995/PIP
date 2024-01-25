package com.adobe.aem.guides.wknd.core.models;

import com.adobe.aem.guides.wknd.core.bean.LetusHelpBean;
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
        adapters = {LetusHelpModel.class, ComponentExporter.class},
        resourceType = {LetusHelpModel.LET_US_HELP_RESOURCE_TYPE})
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class LetusHelpModel implements ComponentExporter {

    protected static final String LET_US_HELP_RESOURCE_TYPE = "wknd/components/letushelp";


    @ValueMapValue
    private String heading;

    @ValueMapValue
    private String description;

    @ValueMapValue
    private String firstDropdownLabel;

    @ValueMapValue
    private String secondDropdownLabel;

    @ChildResource
    private List<LetusHelpBean> dropdownList = new ArrayList<>();

    public String getHeading() {
        return heading;
    }


    public String getDescription() {
        return description;
    }


    public String getFirstDropdownLabel() {
        return firstDropdownLabel;
    }


    public String getSecondDropdownLabel() {
        return secondDropdownLabel;
    }

    public List<LetusHelpBean> getDropdownList() {
        return dropdownList;
    }


    @Override
    public String getExportedType() {
        return LetusHelpModel.LET_US_HELP_RESOURCE_TYPE;
    }
}
