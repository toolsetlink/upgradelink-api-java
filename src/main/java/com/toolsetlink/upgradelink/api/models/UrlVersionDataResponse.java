// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class UrlVersionDataResponse extends TeaModel {
    @NameInMap("urlKey")
    @Validation(required = true)
    public String urlKey;

    @NameInMap("versionName")
    @Validation(required = true)
    public String versionName;

    @NameInMap("versionCode")
    @Validation(required = true)
    public Integer versionCode;

    @NameInMap("description")
    @Validation(required = true)
    public String description;

    public static UrlVersionDataResponse build(java.util.Map<String, ?> map) throws Exception {
        UrlVersionDataResponse self = new UrlVersionDataResponse();
        return TeaModel.build(map, self);
    }

    public UrlVersionDataResponse setUrlKey(String urlKey) {
        this.urlKey = urlKey;
        return this;
    }
    public String getUrlKey() {
        return this.urlKey;
    }

    public UrlVersionDataResponse setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public UrlVersionDataResponse setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public Integer getVersionCode() {
        return this.versionCode;
    }

    public UrlVersionDataResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
