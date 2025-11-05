// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class ElectronVersionResponse extends TeaModel {
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
    public ElectronVersionDataResponse data;

    public static ElectronVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        ElectronVersionResponse self = new ElectronVersionResponse();
        return TeaModel.build(map, self);
    }

    public ElectronVersionResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ElectronVersionResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ElectronVersionResponse setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public ElectronVersionResponse setData(ElectronVersionDataResponse data) {
        this.data = data;
        return this;
    }
    public ElectronVersionDataResponse getData() {
        return this.data;
    }

}
