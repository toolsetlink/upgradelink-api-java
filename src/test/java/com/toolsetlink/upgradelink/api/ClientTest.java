package com.toolsetlink.upgradelink.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.toolsetlink.upgradelink.api.models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.toolsetlink.upgradelink.api.Client.timeRFC3339;

public class ClientTest {

    private final String accessKey = "mui2W50H1j-OC4xD6PgQag";
    private final String accessSecret = "PEbdHFGC0uO_Pch7XWBQTMsFRxKPQAM2565eP8LJ3gc";
    private Client client;
    // 用于将对象转为JSON字符串的工具
    private ObjectMapper objectMapper = new ObjectMapper();

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
        UrlUpgradeRequest request = new UrlUpgradeRequest();
        request.setUrlKey("OpggWISrLVRFa5y04LzkwA");
        request.setVersionCode(1);
        request.setAppointVersionCode(0);
        request.setDevKey("");
        request.setDevModelKey("");

        // 打印完整请求参数
        System.out.println("=== 请求参数（UrlUpgrade）：===");
        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(request));

        try {
            UrlUpgradeResponse response = client.UrlUpgrade(request);
            // 打印完整响应信息（JSON格式）
            System.out.println("\n=== 响应结果（UrlUpgrade）：===");
            System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(response));
        } catch (Exception e) {
            System.out.println("\n=== 请求异常（UrlUpgrade）：===");
            e.printStackTrace(); // 打印完整堆栈信息
        }

    }

    // 测试获取文件应用升级信息
    @Test
    public void testGetFileUpgrade() throws Exception {
        FileUpgradeRequest request = new FileUpgradeRequest();
        request.setFileKey("LOYlLXNy7wV3ySuh0XgtSg");
        request.setVersionCode(1);
        request.setAppointVersionCode(0);
        request.setDevKey("");
        request.setDevModelKey("");

        System.out.println("=== 请求参数（FileUpgrade）：===");
        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(request));

        try {
            FileUpgradeResponse response = client.FileUpgrade(request);
            System.out.println("\n=== 响应结果（FileUpgrade）：===");
            System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(response));
        } catch (Exception e) {
            System.out.println("\n=== 请求异常（FileUpgrade）：===");
            e.printStackTrace();
        }

    }

    // 测试获取apk应用升级信息
    @Test
    public void testGetApkUpgrade() throws Exception {
        ApkUpgradeRequest request = new ApkUpgradeRequest();
        request.setApkKey("isVZBUvkFhv6oHxk_X-D0Q");
        request.setVersionCode(1);
        request.setAppointVersionCode(0);
        request.setDevKey("");
        request.setDevModelKey("");

        System.out.println("=== 请求参数（ApkUpgrade）：===");
        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(request));

        try {
            ApkUpgradeResponse response = client.ApkUpgrade(request);
            System.out.println("\n=== 响应结果（ApkUpgrade）：===");
            System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(response));
        } catch (Exception e) {
            System.out.println("\n=== 请求异常（ApkUpgrade）：===");
            e.printStackTrace();
        }

    }

    // 测试获取配置升级信息
    @Test
    public void testGetConfigurationUpgrade() throws Exception {
        ConfigurationUpgradeRequest request = new ConfigurationUpgradeRequest();
        request.setConfigurationKey("q1hfB1VUQaK9VksTZGPU1Q");
        request.setVersionCode(1);
        request.setAppointVersionCode(0);
        request.setDevKey("");
        request.setDevModelKey("");

        System.out.println("=== 请求参数（ConfigurationUpgrade）：===");
        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(request));

        try {
            ConfigurationUpgradeResponse response = client.ConfigurationUpgrade(request);
            System.out.println("\n=== 响应结果（ConfigurationUpgrade）：===");
            System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(response));
        } catch (Exception e) {
            System.out.println("\n=== 请求异常（ConfigurationUpgrade）：===");
            e.printStackTrace();
        }

    }

    // 测试事件上报接口（app_start）
    @Test
    public void testPostAppReport() throws Exception {
        AppReportRequest request = new AppReportRequest();
        request.setEventType("app_start");
        request.setAppKey("LOYlLXNy7wV3ySuh0XgtSg");
        request.setTimestamp(timeRFC3339());
        request.setEventData(new AppReportRequest.AppReportRequestEventData()
                .setLaunchTime(timeRFC3339())
                .setVersionCode(1)
                .setTarget("darwin")
                .setArch("x86_64")
                .setDevModelKey("")
                .setDevKey("")
        );

        System.out.println("=== 请求参数（app_start）：===");
        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(request));

        try {
            AppReportResponse response = client.AppReport(request);
            System.out.println("\n=== 响应结果（app_start）：===");
            System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(response));
        } catch (Exception e) {
            System.out.println("\n=== 请求异常（app_start）：===");
            e.printStackTrace();
        }

    }

    // 测试事件上报接口（app_upgrade_download）
    @Test
    public void testPostAppReport1() throws Exception {
        AppReportRequest request = new AppReportRequest();
        request.setEventType("app_upgrade_download");
        request.setAppKey("LOYlLXNy7wV3ySuh0XgtSg");
        request.setTimestamp(timeRFC3339());
        request.setEventData(new AppReportRequest.AppReportRequestEventData()
                .setDownloadVersionCode(2)
                .setCode(0)
                .setVersionCode(1)
                .setTarget("darwin")
                .setArch("x86_64")
                .setDevModelKey("")
                .setDevKey("")
        );

        System.out.println("=== 请求参数（app_upgrade_download）：===");
        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(request));

        try {
            AppReportResponse response = client.AppReport(request);
            System.out.println("\n=== 响应结果（app_upgrade_download）：===");
            System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(response));
        } catch (Exception e) {
            System.out.println("\n=== 请求异常（app_upgrade_download）：===");
            e.printStackTrace();
        }

    }

    // 测试事件上报接口（app_upgrade_upgrade）
    @Test
    public void testPostAppReport2() throws Exception {
        AppReportRequest request = new AppReportRequest();
        request.setEventType("app_upgrade_upgrade");
        request.setAppKey("LOYlLXNy7wV3ySuh0XgtSg");
        request.setTimestamp(timeRFC3339());
        request.setEventData(new AppReportRequest.AppReportRequestEventData()
                .setUpgradeVersionCode(2)
                .setCode(0)
                .setVersionCode(1)
                .setTarget("darwin")
                .setArch("x86_64")
                .setDevModelKey("")
                .setDevKey("")
        );

        System.out.println("=== 请求参数（app_upgrade_upgrade）：===");
        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(request));

        try {
            AppReportResponse response = client.AppReport(request);
            System.out.println("\n=== 响应结果（app_upgrade_upgrade）：===");
            System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(response));
        } catch (Exception e) {
            System.out.println("\n=== 请求异常（app_upgrade_upgrade）：===");
            e.printStackTrace();
        }

    }
}