// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class AppReportResponse extends TeaModel {
    @NameInMap("code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("msg")
    @Validation(required = true)
    public String msg;

    @NameInMap("docs")
    @Validation(required = true)
    public String docs;

    @NameInMap("traceId")
    @Validation(required = true)
    public String traceId;

    public static AppReportResponse build(java.util.Map<String, ?> map) throws Exception {
        AppReportResponse self = new AppReportResponse();
        return TeaModel.build(map, self);
    }

    public AppReportResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AppReportResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public AppReportResponse setDocs(String docs) {
        this.docs = docs;
        return this;
    }
    public String getDocs() {
        return this.docs;
    }

    public AppReportResponse setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
