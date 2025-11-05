// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class WinUpgradeRequest extends TeaModel {
    @NameInMap("winKey")
    @Validation(required = true)
    public String winKey;

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

    public static WinUpgradeRequest build(java.util.Map<String, ?> map) throws Exception {
        WinUpgradeRequest self = new WinUpgradeRequest();
        return TeaModel.build(map, self);
    }

    public WinUpgradeRequest setWinKey(String winKey) {
        this.winKey = winKey;
        return this;
    }
    public String getWinKey() {
        return this.winKey;
    }

    public WinUpgradeRequest setArch(String arch) {
        this.arch = arch;
        return this;
    }
    public String getArch() {
        return this.arch;
    }

    public WinUpgradeRequest setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public Integer getVersionCode() {
        return this.versionCode;
    }

    public WinUpgradeRequest setAppointVersionCode(Integer appointVersionCode) {
        this.appointVersionCode = appointVersionCode;
        return this;
    }
    public Integer getAppointVersionCode() {
        return this.appointVersionCode;
    }

    public WinUpgradeRequest setDevModelKey(String devModelKey) {
        this.devModelKey = devModelKey;
        return this;
    }
    public String getDevModelKey() {
        return this.devModelKey;
    }

    public WinUpgradeRequest setDevKey(String devKey) {
        this.devKey = devKey;
        return this;
    }
    public String getDevKey() {
        return this.devKey;
    }

}
