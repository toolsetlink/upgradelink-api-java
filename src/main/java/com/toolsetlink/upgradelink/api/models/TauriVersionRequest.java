// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class TauriVersionRequest extends TeaModel {
    @NameInMap("tauriKey")
    @Validation(required = true)
    public String tauriKey;

    @NameInMap("versionName")
    @Validation(required = true)
    public String versionName;

    @NameInMap("target")
    @Validation(required = true)
    public String target;

    @NameInMap("arch")
    @Validation(required = true)
    public String arch;

    public static TauriVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        TauriVersionRequest self = new TauriVersionRequest();
        return TeaModel.build(map, self);
    }

    public TauriVersionRequest setTauriKey(String tauriKey) {
        this.tauriKey = tauriKey;
        return this;
    }
    public String getTauriKey() {
        return this.tauriKey;
    }

    public TauriVersionRequest setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public TauriVersionRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public TauriVersionRequest setArch(String arch) {
        this.arch = arch;
        return this;
    }
    public String getArch() {
        return this.arch;
    }

}
