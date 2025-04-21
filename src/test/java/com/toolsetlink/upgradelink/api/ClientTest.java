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
            UrlUpgradeResponse info = client.getUrlUpgrade(request);
            System.out.println(info.code);
            System.out.println(info.msg);
            System.out.println(info.data);
        } catch (Exception e) {
            System.out.println("Exception e1:" + e);
        }

        System.out.println("testGetUrlUpgrade end");

    }

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
            FileUpgradeResponse info = client.getFileUpgrade(request);
            System.out.println(info.code);
            System.out.println(info.msg);
            System.out.println(info.data);
        } catch (Exception e) {
            System.out.println("Exception e1:" + e);
        }

        System.out.println("testGetFileUpgrade end");

    }
}