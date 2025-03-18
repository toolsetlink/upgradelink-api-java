// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class UrlUpgradeDataResponse extends TeaModel {
    @NameInMap("urlKey")
    @Validation(required = true)
    public String urlKey;

    @NameInMap("versionName")
    @Validation(required = true)
    public String versionName;

    @NameInMap("versionCode")
    @Validation(required = true)
    public Integer versionCode;

    @NameInMap("urlPath")
    @Validation(required = true)
    public String urlPath;

    @NameInMap("upgradeType")
    @Validation(required = true)
    public Integer upgradeType;

    @NameInMap("promptUpgradeContent")
    @Validation(required = true)
    public String promptUpgradeContent;

    public static UrlUpgradeDataResponse build(java.util.Map<String, ?> map) throws Exception {
        UrlUpgradeDataResponse self = new UrlUpgradeDataResponse();
        return TeaModel.build(map, self);
    }

    public UrlUpgradeDataResponse setUrlKey(String urlKey) {
        this.urlKey = urlKey;
        return this;
    }
    public String getUrlKey() {
        return this.urlKey;
    }

    public UrlUpgradeDataResponse setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public UrlUpgradeDataResponse setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public Integer getVersionCode() {
        return this.versionCode;
    }

    public UrlUpgradeDataResponse setUrlPath(String urlPath) {
        this.urlPath = urlPath;
        return this;
    }
    public String getUrlPath() {
        return this.urlPath;
    }

    public UrlUpgradeDataResponse setUpgradeType(Integer upgradeType) {
        this.upgradeType = upgradeType;
        return this;
    }
    public Integer getUpgradeType() {
        return this.upgradeType;
    }

    public UrlUpgradeDataResponse setPromptUpgradeContent(String promptUpgradeContent) {
        this.promptUpgradeContent = promptUpgradeContent;
        return this;
    }
    public String getPromptUpgradeContent() {
        return this.promptUpgradeContent;
    }

}
