// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class ApkVersionDataResponse extends TeaModel {
    @NameInMap("apkKey")
    @Validation(required = true)
    public String apkKey;

    @NameInMap("packageName")
    @Validation(required = true)
    public String packageName;

    @NameInMap("versionName")
    @Validation(required = true)
    public String versionName;

    @NameInMap("versionCode")
    @Validation(required = true)
    public Integer versionCode;

    @NameInMap("description")
    @Validation(required = true)
    public String description;

    public static ApkVersionDataResponse build(java.util.Map<String, ?> map) throws Exception {
        ApkVersionDataResponse self = new ApkVersionDataResponse();
        return TeaModel.build(map, self);
    }

    public ApkVersionDataResponse setApkKey(String apkKey) {
        this.apkKey = apkKey;
        return this;
    }
    public String getApkKey() {
        return this.apkKey;
    }

    public ApkVersionDataResponse setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }
    public String getPackageName() {
        return this.packageName;
    }

    public ApkVersionDataResponse setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public ApkVersionDataResponse setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public Integer getVersionCode() {
        return this.versionCode;
    }

    public ApkVersionDataResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
