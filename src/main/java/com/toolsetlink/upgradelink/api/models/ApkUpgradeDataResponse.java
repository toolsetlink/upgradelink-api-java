// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class ApkUpgradeDataResponse extends TeaModel {
    @NameInMap("apkKey")
    @Validation(required = true)
    public String apkKey;

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

    public static ApkUpgradeDataResponse build(java.util.Map<String, ?> map) throws Exception {
        ApkUpgradeDataResponse self = new ApkUpgradeDataResponse();
        return TeaModel.build(map, self);
    }

    public ApkUpgradeDataResponse setApkKey(String apkKey) {
        this.apkKey = apkKey;
        return this;
    }
    public String getApkKey() {
        return this.apkKey;
    }

    public ApkUpgradeDataResponse setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }
    public String getPackageName() {
        return this.packageName;
    }

    public ApkUpgradeDataResponse setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public ApkUpgradeDataResponse setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public Integer getVersionCode() {
        return this.versionCode;
    }

    public ApkUpgradeDataResponse setUrlPath(String urlPath) {
        this.urlPath = urlPath;
        return this;
    }
    public String getUrlPath() {
        return this.urlPath;
    }

    public ApkUpgradeDataResponse setUrlFileSize(Integer urlFileSize) {
        this.urlFileSize = urlFileSize;
        return this;
    }
    public Integer getUrlFileSize() {
        return this.urlFileSize;
    }

    public ApkUpgradeDataResponse setUrlFileMd5(String urlFileMd5) {
        this.urlFileMd5 = urlFileMd5;
        return this;
    }
    public String getUrlFileMd5() {
        return this.urlFileMd5;
    }

    public ApkUpgradeDataResponse setUpgradeType(Integer upgradeType) {
        this.upgradeType = upgradeType;
        return this;
    }
    public Integer getUpgradeType() {
        return this.upgradeType;
    }

    public ApkUpgradeDataResponse setPromptUpgradeContent(String promptUpgradeContent) {
        this.promptUpgradeContent = promptUpgradeContent;
        return this;
    }
    public String getPromptUpgradeContent() {
        return this.promptUpgradeContent;
    }

}
