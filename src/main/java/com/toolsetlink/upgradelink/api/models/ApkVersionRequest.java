// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class ApkVersionRequest extends TeaModel {
    @NameInMap("apkKey")
    @Validation(required = true)
    public String apkKey;

    @NameInMap("versionCode")
    @Validation(required = true)
    public Integer versionCode;

    public static ApkVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        ApkVersionRequest self = new ApkVersionRequest();
        return TeaModel.build(map, self);
    }

    public ApkVersionRequest setApkKey(String apkKey) {
        this.apkKey = apkKey;
        return this;
    }
    public String getApkKey() {
        return this.apkKey;
    }

    public ApkVersionRequest setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public Integer getVersionCode() {
        return this.versionCode;
    }

}
