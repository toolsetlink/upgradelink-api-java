// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class WinVersionResponse extends TeaModel {
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
    public FileVersionDataResponse data;

    public static WinVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        WinVersionResponse self = new WinVersionResponse();
        return TeaModel.build(map, self);
    }

    public WinVersionResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public WinVersionResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public WinVersionResponse setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public WinVersionResponse setData(FileVersionDataResponse data) {
        this.data = data;
        return this;
    }
    public FileVersionDataResponse getData() {
        return this.data;
    }

}
