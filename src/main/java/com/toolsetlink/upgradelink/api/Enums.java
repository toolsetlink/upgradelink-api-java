package com.toolsetlink.upgradelink.api;

public class Enums {

    // 事件类型常量
    public static final String EVENT_TYPE_APP_START = "app_start";
    public static final String EVENT_TYPE_APP_UPGRADE_DOWNLOAD = "app_upgrade_download";
    public static final String EVENT_TYPE_APP_UPGRADE_UPGRADE = "app_upgrade_upgrade";

    // 事件状态码常量
    public static final int EVENT_TYPE_CODE_SUCCESS = 0;
    public static final int EVENT_TYPE_CODE_ERROR = 1;
    public static final int EVENT_TYPE_CODE_DOWNLOAD_HTTP_ERROR = 1001;
    public static final int EVENT_TYPE_CODE_DOWNLOAD_NO_ENOUGH_SPACE_ERROR = 1002;
    public static final int EVENT_TYPE_CODE_DOWNLOAD_FILE_OPERATE_ERROR = 1003;
    public static final int EVENT_TYPE_CODE_DOWNLOAD_MD5_ERROR = 1004;
}
