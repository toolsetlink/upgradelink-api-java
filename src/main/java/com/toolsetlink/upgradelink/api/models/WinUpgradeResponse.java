// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class WinUpgradeResponse extends TeaModel {
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
    public WinUpgradeDataResponse data;

    public static WinUpgradeResponse build(java.util.Map<String, ?> map) throws Exception {
        WinUpgradeResponse self = new WinUpgradeResponse();
        return TeaModel.build(map, self);
    }

    public WinUpgradeResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public WinUpgradeResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public WinUpgradeResponse setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public WinUpgradeResponse setData(WinUpgradeDataResponse data) {
        this.data = data;
        return this;
    }
    public WinUpgradeDataResponse getData() {
        return this.data;
    }

}
