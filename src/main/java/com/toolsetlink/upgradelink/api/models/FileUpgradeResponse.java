// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class FileUpgradeResponse extends TeaModel {
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
    public FileUpgradeDataResponse data;

    public static FileUpgradeResponse build(java.util.Map<String, ?> map) throws Exception {
        FileUpgradeResponse self = new FileUpgradeResponse();
        return TeaModel.build(map, self);
    }

    public FileUpgradeResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public FileUpgradeResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public FileUpgradeResponse setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public FileUpgradeResponse setData(FileUpgradeDataResponse data) {
        this.data = data;
        return this;
    }
    public FileUpgradeDataResponse getData() {
        return this.data;
    }

}
