// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class ConfigurationUpgradeResponse extends TeaModel {
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
    public ConfigurationUpgradeDataResponse data;

    public static ConfigurationUpgradeResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigurationUpgradeResponse self = new ConfigurationUpgradeResponse();
        return TeaModel.build(map, self);
    }

    public ConfigurationUpgradeResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ConfigurationUpgradeResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ConfigurationUpgradeResponse setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public ConfigurationUpgradeResponse setData(ConfigurationUpgradeDataResponse data) {
        this.data = data;
        return this;
    }
    public ConfigurationUpgradeDataResponse getData() {
        return this.data;
    }

}
