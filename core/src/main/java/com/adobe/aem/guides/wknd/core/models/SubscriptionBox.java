package com.adobe.aem.guides.wknd.core.models;

import com.adobe.aem.guides.wknd.core.bean.SubscriptionBoxBean;
import com.adobe.cq.export.json.ComponentExporter;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import org.osgi.annotation.versioning.ConsumerType;

import java.util.List;

@ConsumerType
public interface SubscriptionBox extends ComponentExporter {

    @Nullable
    default List<SubscriptionBoxBean> getSubscriptionBox() {
        return null;
    }

    @NotNull
    @Override
    default String getExportedType() {
        return "";
    }
}
