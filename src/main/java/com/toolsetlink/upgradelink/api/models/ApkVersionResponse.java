// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class ApkVersionResponse extends TeaModel {
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
    public ApkVersionDataResponse data;

    public static ApkVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        ApkVersionResponse self = new ApkVersionResponse();
        return TeaModel.build(map, self);
    }

    public ApkVersionResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ApkVersionResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ApkVersionResponse setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public ApkVersionResponse setData(ApkVersionDataResponse data) {
        this.data = data;
        return this;
    }
    public ApkVersionDataResponse getData() {
        return this.data;
    }

}
