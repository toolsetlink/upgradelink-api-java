// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class ConfigurationUpgradeRequest extends TeaModel {
    @NameInMap("configurationKey")
    @Validation(required = true)
    public String configurationKey;

    @NameInMap("versionCode")
    @Validation(required = true)
    public Integer versionCode;

    @NameInMap("appointVersionCode")
    @Validation(required = true)
    public Integer appointVersionCode;

    @NameInMap("devModelKey")
    @Validation(required = true)
    public String devModelKey;

    @NameInMap("devKey")
    @Validation(required = true)
    public String devKey;

    public static ConfigurationUpgradeRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigurationUpgradeRequest self = new ConfigurationUpgradeRequest();
        return TeaModel.build(map, self);
    }

    public ConfigurationUpgradeRequest setConfigurationKey(String configurationKey) {
        this.configurationKey = configurationKey;
        return this;
    }
    public String getConfigurationKey() {
        return this.configurationKey;
    }

    public ConfigurationUpgradeRequest setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public Integer getVersionCode() {
        return this.versionCode;
    }

    public ConfigurationUpgradeRequest setAppointVersionCode(Integer appointVersionCode) {
        this.appointVersionCode = appointVersionCode;
        return this;
    }
    public Integer getAppointVersionCode() {
        return this.appointVersionCode;
    }

    public ConfigurationUpgradeRequest setDevModelKey(String devModelKey) {
        this.devModelKey = devModelKey;
        return this;
    }
    public String getDevModelKey() {
        return this.devModelKey;
    }

    public ConfigurationUpgradeRequest setDevKey(String devKey) {
        this.devKey = devKey;
        return this;
    }
    public String getDevKey() {
        return this.devKey;
    }

}
