// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class ConfigurationVersionResponse extends TeaModel {
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
    public ConfigurationVersionDataResponse data;

    public static ConfigurationVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigurationVersionResponse self = new ConfigurationVersionResponse();
        return TeaModel.build(map, self);
    }

    public ConfigurationVersionResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ConfigurationVersionResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ConfigurationVersionResponse setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public ConfigurationVersionResponse setData(ConfigurationVersionDataResponse data) {
        this.data = data;
        return this;
    }
    public ConfigurationVersionDataResponse getData() {
        return this.data;
    }

}
