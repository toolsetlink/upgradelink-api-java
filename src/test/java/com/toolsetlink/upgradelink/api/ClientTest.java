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
        request.setDevKey("");
        request.setDevModelKey("");

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

    // 测试获取apk应用升级信息
    @Test
    public void testGetApkUpgrade() throws Exception {
        // 创建 Client 对象
        ApkUpgradeRequest request = new ApkUpgradeRequest();
        request.setApkKey("isVZBUvkFhv6oHxk_X-D0Q");
        request.setVersionCode(1);
        request.setAppointVersionCode(0);
        request.setDevKey("");
        request.setDevModelKey("");

        try {
            ApkUpgradeResponse info = client.ApkUpgrade(request);
            System.out.println(info.code);
            System.out.println(info.msg);
            System.out.println(info.data);
        } catch (Exception e) {
            System.out.println("Exception e1:" + e);
        }

        System.out.println("testGetApkUpgrade end");
    }


    // 测试获取配置升级信息
    @Test
    public void testGetConfigurationUpgrade() throws Exception {
        // 创建 Client 对象
        ConfigurationUpgradeRequest request = new ConfigurationUpgradeRequest();
        request.setConfigurationKey("q1hfB1VUQaK9VksTZGPU1Q");
        request.setVersionCode(1);
        request.setAppointVersionCode(0);
        request.setDevKey("");
        request.setDevModelKey("");

        try {
            ConfigurationUpgradeResponse info = client.ConfigurationUpgrade(request);
            System.out.println(info.code);
            System.out.println(info.msg);
            System.out.println(info.data);
        } catch (Exception e) {
            System.out.println("Exception e1:" + e);
        }

        System.out.println("testGetConfigurationUpgrade end");
    }

    // 测试获取事件上报接口
    // /* app_start 应用-启动事件 */
    @Test
    public void testPostAppReport() throws Exception {

        /*  app_start 应用-启动事件 */
        AppReportRequest request = new AppReportRequest();
        request.setEventType(Enums.EVENT_TYPE_APP_START);
        request.setAppKey("LOYlLXNy7wV3ySuh0XgtSg");
        request.setTimestamp(Tools.timeRFC3339());
        request.setEventData(new AppReportRequest.AppReportRequestEventData()
                .setLaunchTime(Tools.timeRFC3339())
                .setVersionCode(1)
                .setTarget("darwin")
                .setArch("x86_64")
                .setDevModelKey("")
                .setDevKey("")
        );

        try {
            AppReportResponse info = client.AppReport(request);
            System.out.println(info.code);
            System.out.println(info.msg);
        } catch (Exception e) {
            System.out.println("Exception e1:" + e);
        }

        System.out.println("testPostAppReport end");
    }

    // 测试获取事件上报接口
    // /* app_upgrade_download 应用升级-下载事件 */
    @Test
    public void testPostAppReport1() throws Exception {

        /*  app_upgrade_download 应用升级-下载事件 */
        AppReportRequest request = new AppReportRequest();
        request.setEventType(Enums.EVENT_TYPE_APP_UPGRADE_DOWNLOAD);
        request.setAppKey("LOYlLXNy7wV3ySuh0XgtSg");
        request.setTimestamp(Tools.timeRFC3339());
        request.setEventData(new AppReportRequest.AppReportRequestEventData()
                .setDownloadVersionCode(2)
                .setCode(0)
                .setVersionCode(1)
                .setTarget("darwin")
                .setArch("x86_64")
                .setDevModelKey("")
                .setDevKey("")
        );

        try {
            AppReportResponse info = client.AppReport(request);
            System.out.println(info.code);
            System.out.println(info.msg);
        } catch (Exception e) {
            System.out.println("Exception e1:" + e);
        }

        System.out.println("testPostAppReport end");
    }

    // 测试获取事件上报接口
    // /* app_upgrade_upgrade 应用升级-升级事件 */
    @Test
    public void testPostAppReport2() throws Exception {

        /*  app_upgrade_upgrade 应用升级-升级事件 */
        AppReportRequest request = new AppReportRequest();
        request.setEventType(Enums.EVENT_TYPE_APP_UPGRADE_UPGRADE);
        request.setAppKey("LOYlLXNy7wV3ySuh0XgtSg");
        request.setTimestamp(Tools.timeRFC3339());
        request.setEventData(new AppReportRequest.AppReportRequestEventData()
                .setUpgradeVersionCode(2)
                .setCode(0)
                .setVersionCode(1)
                .setTarget("darwin")
                .setArch("x86_64")
                .setDevModelKey("")
                .setDevKey("")
        );

        try {
            AppReportResponse info = client.AppReport(request);
            System.out.println(info.code);
            System.out.println(info.msg);
        } catch (Exception e) {
            System.out.println("Exception e1:" + e);
        }

        System.out.println("testPostAppReport end");
    }

}