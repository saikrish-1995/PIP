package com.adobe.aem.guides.wknd.core.models;

import com.adobe.cq.export.json.ComponentExporter;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import org.osgi.annotation.versioning.ConsumerType;

@ConsumerType
public interface HeroBanner extends ComponentExporter {


    @Nullable
    default String getSectionTitle() {
        return null;
    }

    @Nullable
    default String getSectionDescription() {
        return null;
    }

    @Nullable
    default String getBannerDesktopImage() {
        return null;
    }

    @Nullable
    default String getBannerMobileImage() {
        return null;
    }

    @Nullable
    default String getTitle() {
        return null;
    }

    @Nullable
    default String getAltText() {
        return null;
    }

    @Nullable
    default String getLink() {
        return null;
    }

    @Nullable
    default String getLinkTarget() {
        return null;
    }

    @NotNull
    @Override
    default String getExportedType() {
        return "";
    }
}
