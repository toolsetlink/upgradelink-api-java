// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class LnxVersionDataResponse extends TeaModel {
    @NameInMap("lnxKey")
    @Validation(required = true)
    public String lnxKey;

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

    public static LnxVersionDataResponse build(java.util.Map<String, ?> map) throws Exception {
        LnxVersionDataResponse self = new LnxVersionDataResponse();
        return TeaModel.build(map, self);
    }

    public LnxVersionDataResponse setLnxKey(String lnxKey) {
        this.lnxKey = lnxKey;
        return this;
    }
    public String getLnxKey() {
        return this.lnxKey;
    }

    public LnxVersionDataResponse setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }
    public String getPackageName() {
        return this.packageName;
    }

    public LnxVersionDataResponse setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public LnxVersionDataResponse setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public Integer getVersionCode() {
        return this.versionCode;
    }

    public LnxVersionDataResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
