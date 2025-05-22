package com.toolsetlink.upgradelink.api;  // 包名必须与被测试类一致

import com.toolsetlink.upgradelink.api.models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClientTest {  // 类名 = 被测试类名 + Test

    private final String accessKey = "mui2W50H1j-OC4xD6PgQag";
    private final String accessSecret = "PEbdHFGC0uO_Pch7XWBQTMsFRxKPQAM2565eP8LJ3gc";
    private Client client;

    @BeforeEach
    void setUp() throws Exception {
        Config config = new Config();
        config.setAccessKey(accessKey);
        config.setAccessSecret(accessSecret);
        client = new Client(config);
    }

    // 测试获取url应用升级信息
    @Test
    public void testGetUrlUpgrade() throws Exception {
        // 创建 Client 对象
        UrlUpgradeRequest request = new UrlUpgradeRequest();
        request.setUrlKey("uJ47NPeT7qjLa11gL3sVHqw");
        request.setVersionCode(1);
        request.setAppointVersionCode(0);
//        request.setDevKey("");
//        request.setDevModelKey("");

        try {
            UrlUpgradeResponse info = client.UrlUpgrade(request);
            System.out.println(info.code);
            System.out.println(info.msg);
            System.out.println(info.data);
        } catch (Exception e) {
            System.out.println("Exception e1:" + e);
        }

        System.out.println("testGetUrlUpgrade end");

    }

    // 测试获取文件应用升级信息
    @Test
    public void testGetFileUpgrade() throws Exception {
        // 创建 Client 对象
        FileUpgradeRequest request = new FileUpgradeRequest();
        request.setFileKey("uJ47NPeT7qjLa11gL3sVHqw");
        request.setVersionCode(1);
        request.setAppointVersionCode(0);
        request.setDevKey("");
        request.setDevModelKey("");

        try {
            FileUpgradeResponse info = client.FileUpgrade(request);
            System.out.println(info.code);
            System.out.println(info.msg);
            System.out.println(info.data);
        } catch (Exception e) {
            System.out.println("Exception e1:" + e);
        }

        System.out.println("testGetFileUpgrade end");

    }

    // 测试获取事件上报接口
    @Test
    public void testPostAppReport() throws Exception {

        /* app_start 应用-启动事件 */
//        AppReportRequest request = new AppReportRequest();
//        request.setEventType(Enums.EVENT_TYPE_APP_START);
//        request.setAppKey("LOYlLXNy7wV3ySuh0XgtSg");
//        request.setDevKey("");
//        request.setDevModelKey("");
//        request.setVersionCode(1);
//        request.setTimestamp(Tools.timeRFC3339());
//        request.setEventData(new AppReportRequest.AppReportRequestEventData().setLaunchTime(Tools.timeRFC3339()));

        /* app_upgrade_download 应用升级-下载事件 */
//        AppReportRequest request = new AppReportRequest();
//        request.setEventType(Enums.EVENT_TYPE_APP_UPGRADE_DOWNLOAD);
//        request.setAppKey("LOYlLXNy7wV3ySuh0XgtSg");
//        request.setDevKey("");
//        request.setDevModelKey("");
//        request.setVersionCode(1);
//        request.setTimestamp(Tools.timeRFC3339());
//        request.setEventData(new AppReportRequest.AppReportRequestEventData()
//                .setCode(Enums.EVENT_TYPE_CODE_SUCCESS)
//                .setDownloadVersionCode(10));


        /* app_upgrade_install 应用升级-升级事件 */
        AppReportRequest request = new AppReportRequest();
        request.setEventType(Enums.EVENT_TYPE_APP_UPGRADE_UPGRADE);
        request.setAppKey("LOYlLXNy7wV3ySuh0XgtSg");
        request.setDevKey("");
        request.setDevModelKey("");
        request.setVersionCode(1);
        request.setTimestamp(Tools.timeRFC3339());
        request.setEventData(new AppReportRequest.AppReportRequestEventData()
                .setCode(Enums.EVENT_TYPE_CODE_SUCCESS)
                .setUpgradeVersionCode(10));

        try {
            AppReportResponse info = client.AppReport(request);
            System.out.println(info.code);
            System.out.println(info.msg);
        } catch (Exception e) {
            System.out.println("Exception e1:" + e);
        }

        System.out.println("testGetFileUpgrade end");

    }

}