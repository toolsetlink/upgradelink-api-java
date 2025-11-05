// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class MacUpgradeResponse extends TeaModel {
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
    public MacUpgradeDataResponse data;

    public static MacUpgradeResponse build(java.util.Map<String, ?> map) throws Exception {
        MacUpgradeResponse self = new MacUpgradeResponse();
        return TeaModel.build(map, self);
    }

    public MacUpgradeResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public MacUpgradeResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public MacUpgradeResponse setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public MacUpgradeResponse setData(MacUpgradeDataResponse data) {
        this.data = data;
        return this;
    }
    public MacUpgradeDataResponse getData() {
        return this.data;
    }

}
