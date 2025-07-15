// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api.models;

import com.aliyun.tea.*;

public class AppReportRequest extends TeaModel {
    @NameInMap("eventType")
    @Validation(required = true)
    public String eventType;

    @NameInMap("appKey")
    @Validation(required = true)
    public String appKey;

    @NameInMap("timestamp")
    public String timestamp;

    @NameInMap("eventData")
    @Validation(required = true)
    public AppReportRequestEventData eventData;

    public static AppReportRequest build(java.util.Map<String, ?> map) throws Exception {
        AppReportRequest self = new AppReportRequest();
        return TeaModel.build(map, self);
    }

    public AppReportRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public AppReportRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public AppReportRequest setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public AppReportRequest setEventData(AppReportRequestEventData eventData) {
        this.eventData = eventData;
        return this;
    }
    public AppReportRequestEventData getEventData() {
        return this.eventData;
    }

    public static class AppReportRequestEventData extends TeaModel {
        @NameInMap("launchTime")
        public String launchTime;

        @NameInMap("versionCode")
        @Validation(required = true)
        public Integer versionCode;

        @NameInMap("devModelKey")
        public String devModelKey;

        @NameInMap("devKey")
        public String devKey;

        @NameInMap("target")
        public String target;

        @NameInMap("arch")
        public String arch;

        @NameInMap("downloadVersionCode")
        public Integer downloadVersionCode;

        @NameInMap("upgradeVersionCode")
        public Integer upgradeVersionCode;

        @NameInMap("code")
        public Integer code;

        public static AppReportRequestEventData build(java.util.Map<String, ?> map) throws Exception {
            AppReportRequestEventData self = new AppReportRequestEventData();
            return TeaModel.build(map, self);
        }

        public AppReportRequestEventData setLaunchTime(String launchTime) {
            this.launchTime = launchTime;
            return this;
        }
        public String getLaunchTime() {
            return this.launchTime;
        }

        public AppReportRequestEventData setVersionCode(Integer versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public Integer getVersionCode() {
            return this.versionCode;
        }

        public AppReportRequestEventData setDevModelKey(String devModelKey) {
            this.devModelKey = devModelKey;
            return this;
        }
        public String getDevModelKey() {
            return this.devModelKey;
        }

        public AppReportRequestEventData setDevKey(String devKey) {
            this.devKey = devKey;
            return this;
        }
        public String getDevKey() {
            return this.devKey;
        }

        public AppReportRequestEventData setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public AppReportRequestEventData setArch(String arch) {
            this.arch = arch;
            return this;
        }
        public String getArch() {
            return this.arch;
        }

        public AppReportRequestEventData setDownloadVersionCode(Integer downloadVersionCode) {
            this.downloadVersionCode = downloadVersionCode;
            return this;
        }
        public Integer getDownloadVersionCode() {
            return this.downloadVersionCode;
        }

        public AppReportRequestEventData setUpgradeVersionCode(Integer upgradeVersionCode) {
            this.upgradeVersionCode = upgradeVersionCode;
            return this;
        }
        public Integer getUpgradeVersionCode() {
            return this.upgradeVersionCode;
        }

        public AppReportRequestEventData setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

    }

}
