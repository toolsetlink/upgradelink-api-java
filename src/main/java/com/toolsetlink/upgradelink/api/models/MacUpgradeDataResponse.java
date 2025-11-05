// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class MacUpgradeDataResponse extends TeaModel {
    @NameInMap("macKey")
    @Validation(required = true)
    public String macKey;

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

    public static MacUpgradeDataResponse build(java.util.Map<String, ?> map) throws Exception {
        MacUpgradeDataResponse self = new MacUpgradeDataResponse();
        return TeaModel.build(map, self);
    }

    public MacUpgradeDataResponse setMacKey(String macKey) {
        this.macKey = macKey;
        return this;
    }
    public String getMacKey() {
        return this.macKey;
    }

    public MacUpgradeDataResponse setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }
    public String getPackageName() {
        return this.packageName;
    }

    public MacUpgradeDataResponse setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public MacUpgradeDataResponse setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public Integer getVersionCode() {
        return this.versionCode;
    }

    public MacUpgradeDataResponse setUrlPath(String urlPath) {
        this.urlPath = urlPath;
        return this;
    }
    public String getUrlPath() {
        return this.urlPath;
    }

    public MacUpgradeDataResponse setUrlFileSize(Integer urlFileSize) {
        this.urlFileSize = urlFileSize;
        return this;
    }
    public Integer getUrlFileSize() {
        return this.urlFileSize;
    }

    public MacUpgradeDataResponse setUrlFileMd5(String urlFileMd5) {
        this.urlFileMd5 = urlFileMd5;
        return this;
    }
    public String getUrlFileMd5() {
        return this.urlFileMd5;
    }

    public MacUpgradeDataResponse setUpgradeType(Integer upgradeType) {
        this.upgradeType = upgradeType;
        return this;
    }
    public Integer getUpgradeType() {
        return this.upgradeType;
    }

    public MacUpgradeDataResponse setPromptUpgradeContent(String promptUpgradeContent) {
        this.promptUpgradeContent = promptUpgradeContent;
        return this;
    }
    public String getPromptUpgradeContent() {
        return this.promptUpgradeContent;
    }

}
