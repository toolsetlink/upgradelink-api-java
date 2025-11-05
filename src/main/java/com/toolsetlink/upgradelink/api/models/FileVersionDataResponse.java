// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class FileVersionDataResponse extends TeaModel {
    @NameInMap("fileKey")
    @Validation(required = true)
    public String fileKey;

    @NameInMap("versionName")
    @Validation(required = true)
    public String versionName;

    @NameInMap("versionCode")
    @Validation(required = true)
    public Integer versionCode;

    @NameInMap("description")
    @Validation(required = true)
    public String description;

    public static FileVersionDataResponse build(java.util.Map<String, ?> map) throws Exception {
        FileVersionDataResponse self = new FileVersionDataResponse();
        return TeaModel.build(map, self);
    }

    public FileVersionDataResponse setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public FileVersionDataResponse setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public FileVersionDataResponse setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public Integer getVersionCode() {
        return this.versionCode;
    }

    public FileVersionDataResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
