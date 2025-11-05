// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class LnxUpgradeResponse extends TeaModel {
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
    public LnxUpgradeDataResponse data;

    public static LnxUpgradeResponse build(java.util.Map<String, ?> map) throws Exception {
        LnxUpgradeResponse self = new LnxUpgradeResponse();
        return TeaModel.build(map, self);
    }

    public LnxUpgradeResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public LnxUpgradeResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public LnxUpgradeResponse setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public LnxUpgradeResponse setData(LnxUpgradeDataResponse data) {
        this.data = data;
        return this;
    }
    public LnxUpgradeDataResponse getData() {
        return this.data;
    }

}
