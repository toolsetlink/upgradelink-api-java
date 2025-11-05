// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class FileVersionRequest extends TeaModel {
    @NameInMap("fileKey")
    @Validation(required = true)
    public String fileKey;

    @NameInMap("versionCode")
    @Validation(required = true)
    public Integer versionCode;

    public static FileVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        FileVersionRequest self = new FileVersionRequest();
        return TeaModel.build(map, self);
    }

    public FileVersionRequest setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public FileVersionRequest setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public Integer getVersionCode() {
        return this.versionCode;
    }

}
