// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class TauriVersionDataResponse extends TeaModel {
    @NameInMap("tauriKey")
    @Validation(required = true)
    public String tauriKey;

    @NameInMap("versionName")
    @Validation(required = true)
    public String versionName;

    @NameInMap("versionCode")
    @Validation(required = true)
    public Integer versionCode;

    @NameInMap("target")
    @Validation(required = true)
    public String target;

    @NameInMap("arch")
    @Validation(required = true)
    public String arch;

    @NameInMap("description")
    @Validation(required = true)
    public String description;

    public static TauriVersionDataResponse build(java.util.Map<String, ?> map) throws Exception {
        TauriVersionDataResponse self = new TauriVersionDataResponse();
        return TeaModel.build(map, self);
    }

    public TauriVersionDataResponse setTauriKey(String tauriKey) {
        this.tauriKey = tauriKey;
        return this;
    }
    public String getTauriKey() {
        return this.tauriKey;
    }

    public TauriVersionDataResponse setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public TauriVersionDataResponse setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public Integer getVersionCode() {
        return this.versionCode;
    }

    public TauriVersionDataResponse setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public TauriVersionDataResponse setArch(String arch) {
        this.arch = arch;
        return this;
    }
    public String getArch() {
        return this.arch;
    }

    public TauriVersionDataResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
