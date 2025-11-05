// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class LnxVersionResponse extends TeaModel {
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
    public LnxVersionDataResponse data;

    public static LnxVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        LnxVersionResponse self = new LnxVersionResponse();
        return TeaModel.build(map, self);
    }

    public LnxVersionResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public LnxVersionResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public LnxVersionResponse setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public LnxVersionResponse setData(LnxVersionDataResponse data) {
        this.data = data;
        return this;
    }
    public LnxVersionDataResponse getData() {
        return this.data;
    }

}
