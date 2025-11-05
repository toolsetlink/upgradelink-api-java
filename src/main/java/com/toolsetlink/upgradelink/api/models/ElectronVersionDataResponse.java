// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class ElectronVersionDataResponse extends TeaModel {
    @NameInMap("electronKey")
    @Validation(required = true)
    public String electronKey;

    @NameInMap("versionName")
    @Validation(required = true)
    public String versionName;

    @NameInMap("versionCode")
    @Validation(required = true)
    public Integer versionCode;

    @NameInMap("platform")
    @Validation(required = true)
    public String platform;

    @NameInMap("arch")
    @Validation(required = true)
    public String arch;

    @NameInMap("description")
    @Validation(required = true)
    public String description;

    public static ElectronVersionDataResponse build(java.util.Map<String, ?> map) throws Exception {
        ElectronVersionDataResponse self = new ElectronVersionDataResponse();
        return TeaModel.build(map, self);
    }

    public ElectronVersionDataResponse setElectronKey(String electronKey) {
        this.electronKey = electronKey;
        return this;
    }
    public String getElectronKey() {
        return this.electronKey;
    }

    public ElectronVersionDataResponse setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public ElectronVersionDataResponse setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public Integer getVersionCode() {
        return this.versionCode;
    }

    public ElectronVersionDataResponse setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public ElectronVersionDataResponse setArch(String arch) {
        this.arch = arch;
        return this;
    }
    public String getArch() {
        return this.arch;
    }

    public ElectronVersionDataResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
