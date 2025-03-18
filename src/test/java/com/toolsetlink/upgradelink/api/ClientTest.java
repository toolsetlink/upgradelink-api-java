package com.toolsetlink.upgradelink.api;  // 包名必须与被测试类一致

import com.toolsetlink.upgradelink.api.models.FileUpgradeRequest;
import com.toolsetlink.upgradelink.api.models.FileUpgradeResponse;
import com.toolsetlink.upgradelink.api.models.UrlUpgradeRequest;
import com.toolsetlink.upgradelink.api.models.UrlUpgradeResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClientTest {  // 类名 = 被测试类名 + Test

    private final String accessKeyId = "a1";
    private final String accessKeySecret = "a2";
    private Client client;

    @BeforeEach
    void setUp() throws Exception {
        client = new Client(accessKeyId, accessKeySecret);
    }

    @Test
    public void testGetUrlUpgrade() throws Exception {
        // 创建 Client 对象
        Client client = new Client(accessKeyId, accessKeySecret);

        UrlUpgradeRequest request = new UrlUpgradeRequest();
        request.setUrlKey("key1");
        request.setVersionCode(1);
        request.setAppointVersionCode(0);
        request.setDevKey("macmac");
        request.setDevModelKey("tv1");

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
        Client client = new Client(accessKeyId, accessKeySecret);

        FileUpgradeRequest request = new FileUpgradeRequest();
        request.setFileKey("key1");
        request.setVersionCode(1);
        request.setAppointVersionCode(0);
        request.setDevKey("macmac");
        request.setDevModelKey("tv1");

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