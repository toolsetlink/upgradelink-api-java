// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class ConfigurationUpgradeDataResponse extends TeaModel {
    @NameInMap("configurationKey")
    @Validation(required = true)
    public String configurationKey;

    @NameInMap("versionName")
    @Validation(required = true)
    public String versionName;

    @NameInMap("versionCode")
    @Validation(required = true)
    public Integer versionCode;

    @NameInMap("upgradeType")
    @Validation(required = true)
    public Integer upgradeType;

    @NameInMap("promptUpgradeContent")
    @Validation(required = true)
    public String promptUpgradeContent;

    @NameInMap("content")
    @Validation(required = true)
    public Object content;

    public static ConfigurationUpgradeDataResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigurationUpgradeDataResponse self = new ConfigurationUpgradeDataResponse();
        return TeaModel.build(map, self);
    }

    public ConfigurationUpgradeDataResponse setConfigurationKey(String configurationKey) {
        this.configurationKey = configurationKey;
        return this;
    }
    public String getConfigurationKey() {
        return this.configurationKey;
    }

    public ConfigurationUpgradeDataResponse setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public ConfigurationUpgradeDataResponse setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public Integer getVersionCode() {
        return this.versionCode;
    }

    public ConfigurationUpgradeDataResponse setUpgradeType(Integer upgradeType) {
        this.upgradeType = upgradeType;
        return this;
    }
    public Integer getUpgradeType() {
        return this.upgradeType;
    }

    public ConfigurationUpgradeDataResponse setPromptUpgradeContent(String promptUpgradeContent) {
        this.promptUpgradeContent = promptUpgradeContent;
        return this;
    }
    public String getPromptUpgradeContent() {
        return this.promptUpgradeContent;
    }

    public ConfigurationUpgradeDataResponse setContent(Object content) {
        this.content = content;
        return this;
    }
    public Object getContent() {
        return this.content;
    }

}
