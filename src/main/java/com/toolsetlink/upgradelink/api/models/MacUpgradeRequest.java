// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class MacUpgradeRequest extends TeaModel {
    @NameInMap("macKey")
    @Validation(required = true)
    public String macKey;

    @NameInMap("arch")
    @Validation(required = true)
    public String arch;

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

    public static MacUpgradeRequest build(java.util.Map<String, ?> map) throws Exception {
        MacUpgradeRequest self = new MacUpgradeRequest();
        return TeaModel.build(map, self);
    }

    public MacUpgradeRequest setMacKey(String macKey) {
        this.macKey = macKey;
        return this;
    }
    public String getMacKey() {
        return this.macKey;
    }

    public MacUpgradeRequest setArch(String arch) {
        this.arch = arch;
        return this;
    }
    public String getArch() {
        return this.arch;
    }

    public MacUpgradeRequest setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public Integer getVersionCode() {
        return this.versionCode;
    }

    public MacUpgradeRequest setAppointVersionCode(Integer appointVersionCode) {
        this.appointVersionCode = appointVersionCode;
        return this;
    }
    public Integer getAppointVersionCode() {
        return this.appointVersionCode;
    }

    public MacUpgradeRequest setDevModelKey(String devModelKey) {
        this.devModelKey = devModelKey;
        return this;
    }
    public String getDevModelKey() {
        return this.devModelKey;
    }

    public MacUpgradeRequest setDevKey(String devKey) {
        this.devKey = devKey;
        return this;
    }
    public String getDevKey() {
        return this.devKey;
    }

}
