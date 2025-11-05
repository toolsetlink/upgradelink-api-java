// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class UrlVersionRequest extends TeaModel {
    @NameInMap("urlKey")
    @Validation(required = true)
    public String urlKey;

    @NameInMap("versionCode")
    @Validation(required = true)
    public Integer versionCode;

    public static UrlVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UrlVersionRequest self = new UrlVersionRequest();
        return TeaModel.build(map, self);
    }

    public UrlVersionRequest setUrlKey(String urlKey) {
        this.urlKey = urlKey;
        return this;
    }
    public String getUrlKey() {
        return this.urlKey;
    }

    public UrlVersionRequest setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public Integer getVersionCode() {
        return this.versionCode;
    }

}
