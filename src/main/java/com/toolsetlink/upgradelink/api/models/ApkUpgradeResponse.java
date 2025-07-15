// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class ApkUpgradeResponse extends TeaModel {
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
    public ApkUpgradeDataResponse data;

    public static ApkUpgradeResponse build(java.util.Map<String, ?> map) throws Exception {
        ApkUpgradeResponse self = new ApkUpgradeResponse();
        return TeaModel.build(map, self);
    }

    public ApkUpgradeResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ApkUpgradeResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ApkUpgradeResponse setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public ApkUpgradeResponse setData(ApkUpgradeDataResponse data) {
        this.data = data;
        return this;
    }
    public ApkUpgradeDataResponse getData() {
        return this.data;
    }

}
