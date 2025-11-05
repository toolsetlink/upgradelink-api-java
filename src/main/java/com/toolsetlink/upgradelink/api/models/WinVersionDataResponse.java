// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class WinVersionDataResponse extends TeaModel {
    @NameInMap("winKey")
    @Validation(required = true)
    public String winKey;

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

    public static WinVersionDataResponse build(java.util.Map<String, ?> map) throws Exception {
        WinVersionDataResponse self = new WinVersionDataResponse();
        return TeaModel.build(map, self);
    }

    public WinVersionDataResponse setWinKey(String winKey) {
        this.winKey = winKey;
        return this;
    }
    public String getWinKey() {
        return this.winKey;
    }

    public WinVersionDataResponse setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }
    public String getPackageName() {
        return this.packageName;
    }

    public WinVersionDataResponse setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public WinVersionDataResponse setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public Integer getVersionCode() {
        return this.versionCode;
    }

    public WinVersionDataResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
