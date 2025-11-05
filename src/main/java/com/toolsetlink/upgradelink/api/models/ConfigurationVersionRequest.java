// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class ConfigurationVersionRequest extends TeaModel {
    @NameInMap("configurationKey")
    @Validation(required = true)
    public String configurationKey;

    @NameInMap("versionCode")
    @Validation(required = true)
    public Integer versionCode;

    public static ConfigurationVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigurationVersionRequest self = new ConfigurationVersionRequest();
        return TeaModel.build(map, self);
    }

    public ConfigurationVersionRequest setConfigurationKey(String configurationKey) {
        this.configurationKey = configurationKey;
        return this;
    }
    public String getConfigurationKey() {
        return this.configurationKey;
    }

    public ConfigurationVersionRequest setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public Integer getVersionCode() {
        return this.versionCode;
    }

}
