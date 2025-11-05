// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class MacVersionRequest extends TeaModel {
    @NameInMap("macKey")
    @Validation(required = true)
    public String macKey;

    @NameInMap("versionCode")
    @Validation(required = true)
    public Integer versionCode;

    @NameInMap("arch")
    @Validation(required = true)
    public String arch;

    public static MacVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        MacVersionRequest self = new MacVersionRequest();
        return TeaModel.build(map, self);
    }

    public MacVersionRequest setMacKey(String macKey) {
        this.macKey = macKey;
        return this;
    }
    public String getMacKey() {
        return this.macKey;
    }

    public MacVersionRequest setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public Integer getVersionCode() {
        return this.versionCode;
    }

    public MacVersionRequest setArch(String arch) {
        this.arch = arch;
        return this;
    }
    public String getArch() {
        return this.arch;
    }

}
