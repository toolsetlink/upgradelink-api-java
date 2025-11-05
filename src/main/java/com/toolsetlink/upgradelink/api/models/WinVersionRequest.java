// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class WinVersionRequest extends TeaModel {
    @NameInMap("winKey")
    @Validation(required = true)
    public String winKey;

    @NameInMap("versionCode")
    @Validation(required = true)
    public Integer versionCode;

    @NameInMap("arch")
    @Validation(required = true)
    public String arch;

    public static WinVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        WinVersionRequest self = new WinVersionRequest();
        return TeaModel.build(map, self);
    }

    public WinVersionRequest setWinKey(String winKey) {
        this.winKey = winKey;
        return this;
    }
    public String getWinKey() {
        return this.winKey;
    }

    public WinVersionRequest setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public Integer getVersionCode() {
        return this.versionCode;
    }

    public WinVersionRequest setArch(String arch) {
        this.arch = arch;
        return this;
    }
    public String getArch() {
        return this.arch;
    }

}
