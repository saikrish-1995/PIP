package com.adobe.aem.guides.wknd.core.models;

import com.adobe.aem.guides.wknd.core.bean.FooterBean;
import com.adobe.cq.export.json.ComponentExporter;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import org.apache.commons.lang3.StringUtils;
import org.osgi.annotation.versioning.ConsumerType;

import java.util.List;

@ConsumerType
public interface Footer extends ComponentExporter {

    @Nullable
    default List<FooterBean>getFirstColumnMenu() {
        return null;
    }

    @Nullable
    default List<FooterBean>getSecondColumnMenu() {
        return null;
    }

    @Nullable
    default String getAppDownloadText() {
        return null;
    }

    @Nullable
    default List<FooterBean>getAppDownloadList() {
        return null;
    }

    @Nullable
    default String getSocialMediaText() {
        return null;
    }

    @Nullable
    default List<FooterBean>getSocialMediaList() {
        return null;
    }

    @Nullable
    default String getCopyRight() {
        return null;
    }

    @Nullable
    default List<FooterBean>getLegalleseLinks() {
        return null;
    }

    @NotNull
    @Override
    default String getExportedType() {
        return StringUtils.EMPTY;

    }

}
