// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class WinUpgradeDataResponse extends TeaModel {
    @NameInMap("winKey")
    @Validation(required = true)
    public String winKey;

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

    public static WinUpgradeDataResponse build(java.util.Map<String, ?> map) throws Exception {
        WinUpgradeDataResponse self = new WinUpgradeDataResponse();
        return TeaModel.build(map, self);
    }

    public WinUpgradeDataResponse setWinKey(String winKey) {
        this.winKey = winKey;
        return this;
    }
    public String getWinKey() {
        return this.winKey;
    }

    public WinUpgradeDataResponse setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }
    public String getPackageName() {
        return this.packageName;
    }

    public WinUpgradeDataResponse setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public WinUpgradeDataResponse setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public Integer getVersionCode() {
        return this.versionCode;
    }

    public WinUpgradeDataResponse setUrlPath(String urlPath) {
        this.urlPath = urlPath;
        return this;
    }
    public String getUrlPath() {
        return this.urlPath;
    }

    public WinUpgradeDataResponse setUrlFileSize(Integer urlFileSize) {
        this.urlFileSize = urlFileSize;
        return this;
    }
    public Integer getUrlFileSize() {
        return this.urlFileSize;
    }

    public WinUpgradeDataResponse setUrlFileMd5(String urlFileMd5) {
        this.urlFileMd5 = urlFileMd5;
        return this;
    }
    public String getUrlFileMd5() {
        return this.urlFileMd5;
    }

    public WinUpgradeDataResponse setUpgradeType(Integer upgradeType) {
        this.upgradeType = upgradeType;
        return this;
    }
    public Integer getUpgradeType() {
        return this.upgradeType;
    }

    public WinUpgradeDataResponse setPromptUpgradeContent(String promptUpgradeContent) {
        this.promptUpgradeContent = promptUpgradeContent;
        return this;
    }
    public String getPromptUpgradeContent() {
        return this.promptUpgradeContent;
    }

}
