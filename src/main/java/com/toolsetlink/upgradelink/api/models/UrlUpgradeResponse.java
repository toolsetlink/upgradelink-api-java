// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class UrlUpgradeResponse extends TeaModel {
    @NameInMap("code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("msg")
    @Validation(required = true)
    public String msg;

    @NameInMap("traceId")
    @Validation(required = true)
    public String traceId;

    @NameInMap("data")
    @Validation(required = true)
    public UrlUpgradeDataResponse data;

    public static UrlUpgradeResponse build(java.util.Map<String, ?> map) throws Exception {
        UrlUpgradeResponse self = new UrlUpgradeResponse();
        return TeaModel.build(map, self);
    }

    public UrlUpgradeResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UrlUpgradeResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public UrlUpgradeResponse setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public UrlUpgradeResponse setData(UrlUpgradeDataResponse data) {
        this.data = data;
        return this;
    }
    public UrlUpgradeDataResponse getData() {
        return this.data;
    }

}
