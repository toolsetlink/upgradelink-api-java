// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class LnxUpgradeDataResponse extends TeaModel {
    @NameInMap("lnxKey")
    @Validation(required = true)
    public String lnxKey;

    @NameInMap("packageName")
    @Validation(required = true)
    public String packageName;

    @NameInMap("versionName")
    @Validation(required = true)
    public String versionName;

    @NameInMap("versionCode")
    @Validation(required = true)
    public Integer versionCode;

    @NameInMap("urlPath")
    @Validation(required = true)
    public String urlPath;

    @NameInMap("urlFileSize")
    @Validation(required = true)
    public Integer urlFileSize;

    @NameInMap("urlFileMd5")
    @Validation(required = true)
    public String urlFileMd5;

    @NameInMap("upgradeType")
    @Validation(required = true)
    public Integer upgradeType;

    @NameInMap("promptUpgradeContent")
    @Validation(required = true)
    public String promptUpgradeContent;

    public static LnxUpgradeDataResponse build(java.util.Map<String, ?> map) throws Exception {
        LnxUpgradeDataResponse self = new LnxUpgradeDataResponse();
        return TeaModel.build(map, self);
    }

    public LnxUpgradeDataResponse setLnxKey(String lnxKey) {
        this.lnxKey = lnxKey;
        return this;
    }
    public String getLnxKey() {
        return this.lnxKey;
    }

    public LnxUpgradeDataResponse setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }
    public String getPackageName() {
        return this.packageName;
    }

    public LnxUpgradeDataResponse setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public LnxUpgradeDataResponse setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public Integer getVersionCode() {
        return this.versionCode;
    }

    public LnxUpgradeDataResponse setUrlPath(String urlPath) {
        this.urlPath = urlPath;
        return this;
    }
    public String getUrlPath() {
        return this.urlPath;
    }

    public LnxUpgradeDataResponse setUrlFileSize(Integer urlFileSize) {
        this.urlFileSize = urlFileSize;
        return this;
    }
    public Integer getUrlFileSize() {
        return this.urlFileSize;
    }

    public LnxUpgradeDataResponse setUrlFileMd5(String urlFileMd5) {
        this.urlFileMd5 = urlFileMd5;
        return this;
    }
    public String getUrlFileMd5() {
        return this.urlFileMd5;
    }

    public LnxUpgradeDataResponse setUpgradeType(Integer upgradeType) {
        this.upgradeType = upgradeType;
        return this;
    }
    public Integer getUpgradeType() {
        return this.upgradeType;
    }

    public LnxUpgradeDataResponse setPromptUpgradeContent(String promptUpgradeContent) {
        this.promptUpgradeContent = promptUpgradeContent;
        return this;
    }
    public String getPromptUpgradeContent() {
        return this.promptUpgradeContent;
    }

}
