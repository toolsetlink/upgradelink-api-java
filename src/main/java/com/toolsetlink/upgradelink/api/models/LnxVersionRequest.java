// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class LnxVersionRequest extends TeaModel {
    @NameInMap("lnxKey")
    @Validation(required = true)
    public String lnxKey;

    @NameInMap("arch")
    @Validation(required = true)
    public String arch;

    @NameInMap("versionCode")
    @Validation(required = true)
    public Integer versionCode;

    public static LnxVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        LnxVersionRequest self = new LnxVersionRequest();
        return TeaModel.build(map, self);
    }

    public LnxVersionRequest setLnxKey(String lnxKey) {
        this.lnxKey = lnxKey;
        return this;
    }
    public String getLnxKey() {
        return this.lnxKey;
    }

    public LnxVersionRequest setArch(String arch) {
        this.arch = arch;
        return this;
    }
    public String getArch() {
        return this.arch;
    }

    public LnxVersionRequest setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public Integer getVersionCode() {
        return this.versionCode;
    }

}
