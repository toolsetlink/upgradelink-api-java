package com.toolsetlink.upgradelink.api;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Tools {
    public static String timeRFC3339() throws Exception {
        // 使用当前时间并格式化为RFC3339格式
        return ZonedDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX"));
    }
}
