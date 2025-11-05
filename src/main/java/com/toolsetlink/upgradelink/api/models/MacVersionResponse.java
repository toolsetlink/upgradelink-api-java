// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class MacVersionResponse extends TeaModel {
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
    public MacVersionDataResponse data;

    public static MacVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        MacVersionResponse self = new MacVersionResponse();
        return TeaModel.build(map, self);
    }

    public MacVersionResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public MacVersionResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public MacVersionResponse setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public MacVersionResponse setData(MacVersionDataResponse data) {
        this.data = data;
        return this;
    }
    public MacVersionDataResponse getData() {
        return this.data;
    }

}
