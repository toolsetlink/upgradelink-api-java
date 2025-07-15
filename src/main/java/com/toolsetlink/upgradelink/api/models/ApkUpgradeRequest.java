// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class ApkUpgradeRequest extends TeaModel {
    @NameInMap("apkKey")
    @Validation(required = true)
    public String apkKey;

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

    public static ApkUpgradeRequest build(java.util.Map<String, ?> map) throws Exception {
        ApkUpgradeRequest self = new ApkUpgradeRequest();
        return TeaModel.build(map, self);
    }

    public ApkUpgradeRequest setApkKey(String apkKey) {
        this.apkKey = apkKey;
        return this;
    }
    public String getApkKey() {
        return this.apkKey;
    }

    public ApkUpgradeRequest setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public Integer getVersionCode() {
        return this.versionCode;
    }

    public ApkUpgradeRequest setAppointVersionCode(Integer appointVersionCode) {
        this.appointVersionCode = appointVersionCode;
        return this;
    }
    public Integer getAppointVersionCode() {
        return this.appointVersionCode;
    }

    public ApkUpgradeRequest setDevModelKey(String devModelKey) {
        this.devModelKey = devModelKey;
        return this;
    }
    public String getDevModelKey() {
        return this.devModelKey;
    }

    public ApkUpgradeRequest setDevKey(String devKey) {
        this.devKey = devKey;
        return this;
    }
    public String getDevKey() {
        return this.devKey;
    }

}
