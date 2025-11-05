// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class MacVersionDataResponse extends TeaModel {
    @NameInMap("macKey")
    @Validation(required = true)
    public String macKey;

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

    public static MacVersionDataResponse build(java.util.Map<String, ?> map) throws Exception {
        MacVersionDataResponse self = new MacVersionDataResponse();
        return TeaModel.build(map, self);
    }

    public MacVersionDataResponse setMacKey(String macKey) {
        this.macKey = macKey;
        return this;
    }
    public String getMacKey() {
        return this.macKey;
    }

    public MacVersionDataResponse setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }
    public String getPackageName() {
        return this.packageName;
    }

    public MacVersionDataResponse setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public MacVersionDataResponse setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public Integer getVersionCode() {
        return this.versionCode;
    }

    public MacVersionDataResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
