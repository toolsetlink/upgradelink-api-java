// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class ElectronVersionRequest extends TeaModel {
    @NameInMap("electronKey")
    @Validation(required = true)
    public String electronKey;

    @NameInMap("versionName")
    @Validation(required = true)
    public String versionName;

    @NameInMap("platform")
    @Validation(required = true)
    public String platform;

    @NameInMap("arch")
    @Validation(required = true)
    public String arch;

    public static ElectronVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        ElectronVersionRequest self = new ElectronVersionRequest();
        return TeaModel.build(map, self);
    }

    public ElectronVersionRequest setElectronKey(String electronKey) {
        this.electronKey = electronKey;
        return this;
    }
    public String getElectronKey() {
        return this.electronKey;
    }

    public ElectronVersionRequest setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public ElectronVersionRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public ElectronVersionRequest setArch(String arch) {
        this.arch = arch;
        return this;
    }
    public String getArch() {
        return this.arch;
    }

}
