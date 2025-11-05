// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class LnxUpgradeRequest extends TeaModel {
    @NameInMap("lnxKey")
    @Validation(required = true)
    public String lnxKey;

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

    public static LnxUpgradeRequest build(java.util.Map<String, ?> map) throws Exception {
        LnxUpgradeRequest self = new LnxUpgradeRequest();
        return TeaModel.build(map, self);
    }

    public LnxUpgradeRequest setLnxKey(String lnxKey) {
        this.lnxKey = lnxKey;
        return this;
    }
    public String getLnxKey() {
        return this.lnxKey;
    }

    public LnxUpgradeRequest setArch(String arch) {
        this.arch = arch;
        return this;
    }
    public String getArch() {
        return this.arch;
    }

    public LnxUpgradeRequest setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public Integer getVersionCode() {
        return this.versionCode;
    }

    public LnxUpgradeRequest setAppointVersionCode(Integer appointVersionCode) {
        this.appointVersionCode = appointVersionCode;
        return this;
    }
    public Integer getAppointVersionCode() {
        return this.appointVersionCode;
    }

    public LnxUpgradeRequest setDevModelKey(String devModelKey) {
        this.devModelKey = devModelKey;
        return this;
    }
    public String getDevModelKey() {
        return this.devModelKey;
    }

    public LnxUpgradeRequest setDevKey(String devKey) {
        this.devKey = devKey;
        return this;
    }
    public String getDevKey() {
        return this.devKey;
    }

}
