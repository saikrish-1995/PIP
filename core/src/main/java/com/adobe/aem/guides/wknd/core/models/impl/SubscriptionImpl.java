package com.adobe.aem.guides.wknd.core.models.impl;


import com.adobe.aem.guides.wknd.core.bean.SubscriptionBoxBean;
import com.adobe.aem.guides.wknd.core.models.SubscriptionBox;
import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;

import java.util.*;


@Model(adaptables = {SlingHttpServletRequest.class, Resource.class},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        adapters = {SubscriptionBox.class, ComponentExporter.class},
        resourceType = {SubscriptionImpl.SUBSCRIPTION_BOX_RESOURCE_TYPE})
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class SubscriptionImpl implements SubscriptionBox {

    protected static final String SUBSCRIPTION_BOX_RESOURCE_TYPE = "wknd/components/subscription-box";

    @ScriptVariable
    private Resource resource;

    @ChildResource
    private List<SubscriptionBoxBean> subscriptionBox = new ArrayList<>();

    @Override
    public List<SubscriptionBoxBean> getSubscriptionBox() {
        return subscriptionBox;
    }

   
    @Override
    public String getExportedType() {
        return resource.getResourceType();
    }
}
