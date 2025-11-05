// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class UrlVersionResponse extends TeaModel {
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
    public UrlVersionDataResponse data;

    public static UrlVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UrlVersionResponse self = new UrlVersionResponse();
        return TeaModel.build(map, self);
    }

    public UrlVersionResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UrlVersionResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public UrlVersionResponse setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public UrlVersionResponse setData(UrlVersionDataResponse data) {
        this.data = data;
        return this;
    }
    public UrlVersionDataResponse getData() {
        return this.data;
    }

}
