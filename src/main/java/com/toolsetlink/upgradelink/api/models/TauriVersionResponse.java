// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class TauriVersionResponse extends TeaModel {
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
    public TauriVersionDataResponse data;

    public static TauriVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        TauriVersionResponse self = new TauriVersionResponse();
        return TeaModel.build(map, self);
    }

    public TauriVersionResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public TauriVersionResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public TauriVersionResponse setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public TauriVersionResponse setData(TauriVersionDataResponse data) {
        this.data = data;
        return this;
    }
    public TauriVersionDataResponse getData() {
        return this.data;
    }

}
