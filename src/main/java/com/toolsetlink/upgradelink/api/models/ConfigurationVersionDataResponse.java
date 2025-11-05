// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class ConfigurationVersionDataResponse extends TeaModel {
    @NameInMap("configurationKey")
    @Validation(required = true)
    public String configurationKey;

    @NameInMap("versionName")
    @Validation(required = true)
    public String versionName;

    @NameInMap("versionCode")
    @Validation(required = true)
    public Integer versionCode;

    @NameInMap("description")
    @Validation(required = true)
    public String description;

    public static ConfigurationVersionDataResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigurationVersionDataResponse self = new ConfigurationVersionDataResponse();
        return TeaModel.build(map, self);
    }

    public ConfigurationVersionDataResponse setConfigurationKey(String configurationKey) {
        this.configurationKey = configurationKey;
        return this;
    }
    public String getConfigurationKey() {
        return this.configurationKey;
    }

    public ConfigurationVersionDataResponse setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public ConfigurationVersionDataResponse setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public Integer getVersionCode() {
        return this.versionCode;
    }

    public ConfigurationVersionDataResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
