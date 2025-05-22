// This file is auto-generated, don't edit it. Thanks.
package com.toolsetlink.upgradelink.api;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.toolsetlink.upgradelink.api.models.*;

public class Client {

    private final static InterceptorChain interceptorChain = InterceptorChain.create();

    public String _accessKey;
    public String _accessSecret;
    public String _protocol;
    public String _endpoint;
    public Client(Config config) throws Exception {
        this._accessKey = config.accessKey;
        this._accessSecret = config.accessSecret;
        if (com.aliyun.teautil.Common.equalString(config.protocol, "HTTPS")) {
            this._protocol = "HTTPS";
        } else {
            this._protocol = "HTTP";
        }

        if (com.aliyun.teautil.Common.empty(config.endpoint)) {
            this._endpoint = "api.upgrade.toolsetlink.com";
        } else {
            this._endpoint = config.endpoint;
        }

    }

    public UrlUpgradeResponse UrlUpgrade(UrlUpgradeRequest request) throws Exception {
        TeaModel.validateParams(request, "request");
        java.util.Map<String, Object> runtime_ = TeaConverter.buildMap(
            new TeaPair("timeout", 10000)
        );

        TeaRequest _lastRequest = null;
        Exception _lastException = null;
        long _now = System.currentTimeMillis();
        int _retryTimes = 0;
        while (Tea.allowRetry((java.util.Map<String, Object>) runtime_.get("retry"), _retryTimes, _now)) {
            if (_retryTimes > 0) {
                int backoffTime = Tea.getBackoffTime(runtime_.get("backoff"), _retryTimes);
                if (backoffTime > 0) {
                    Tea.sleep(backoffTime);
                }
            }
            _retryTimes = _retryTimes + 1;
            try {
                TeaRequest request_ = new TeaRequest();
                // 序列化请求体
                String bodyStr = com.aliyun.teautil.Common.toJSONString(request);
                // 生成请求参数
                String timestamp = com.toolsetlink.darabonba.base.Client.timeRFC3339();
                String nonce = com.toolsetlink.darabonba.base.Client.generateNonce();
                String uri = "/v1/url/upgrade";
                String accessKey = _accessKey;
                String accessSecret = _accessSecret;
                // 生成签名
                String signature = com.toolsetlink.darabonba.base.Client.generateSignature(bodyStr, nonce, accessSecret, timestamp, uri);
                request_.protocol = _protocol;
                request_.method = "POST";
                request_.pathname = "/v1/url/upgrade";
                request_.headers = TeaConverter.buildMap(
                    new TeaPair("host", _endpoint),
                    new TeaPair("content-type", "application/json"),
                    new TeaPair("x-Timestamp", timestamp),
                    new TeaPair("x-Nonce", nonce),
                    new TeaPair("x-AccessKey", accessKey),
                    new TeaPair("x-Signature", signature)
                );
                request_.body = Tea.toReadable(bodyStr);
                _lastRequest = request_;
                TeaResponse response_ = Tea.doAction(request_, runtime_, interceptorChain);

                java.util.Map<String, Object> result = com.aliyun.teautil.Common.assertAsMap(com.aliyun.teautil.Common.readAsJSON(response_.body));
                if (!com.aliyun.teautil.Common.equalNumber(response_.statusCode, 200)) {
                    throw new TeaException(TeaConverter.buildMap(
                        new TeaPair("statusCode", "" + response_.statusCode + ""),
                        new TeaPair("code", "" + result.get("code") + ""),
                        new TeaPair("message", "" + result.get("msg") + ""),
                        new TeaPair("docs", "" + result.get("docs") + ""),
                        new TeaPair("traceId", "" + result.get("traceId") + "")
                    ));
                }

                return TeaModel.toModel(TeaConverter.merge(Object.class,
                    result
                ), new UrlUpgradeResponse());
            } catch (Exception e) {
                if (Tea.isRetryable(e)) {
                    _lastException = e;
                    continue;
                }
                throw e;
            }
        }
        throw new TeaUnretryableException(_lastRequest, _lastException);
    }

    public FileUpgradeResponse FileUpgrade(FileUpgradeRequest request) throws Exception {
        TeaModel.validateParams(request, "request");
        java.util.Map<String, Object> runtime_ = TeaConverter.buildMap(
            new TeaPair("timeout", 10000)
        );

        TeaRequest _lastRequest = null;
        Exception _lastException = null;
        long _now = System.currentTimeMillis();
        int _retryTimes = 0;
        while (Tea.allowRetry((java.util.Map<String, Object>) runtime_.get("retry"), _retryTimes, _now)) {
            if (_retryTimes > 0) {
                int backoffTime = Tea.getBackoffTime(runtime_.get("backoff"), _retryTimes);
                if (backoffTime > 0) {
                    Tea.sleep(backoffTime);
                }
            }
            _retryTimes = _retryTimes + 1;
            try {
                TeaRequest request_ = new TeaRequest();
                // 序列化请求体
                String bodyStr = com.aliyun.teautil.Common.toJSONString(request);
                // 生成请求参数
                String timestamp = com.toolsetlink.darabonba.base.Client.timeRFC3339();
                String nonce = com.toolsetlink.darabonba.base.Client.generateNonce();
                String uri = "/v1/file/upgrade";
                String accessKey = _accessKey;
                String accessSecret = _accessSecret;
                // 生成签名
                String signature = com.toolsetlink.darabonba.base.Client.generateSignature(bodyStr, nonce, accessSecret, timestamp, uri);
                request_.protocol = _protocol;
                request_.method = "POST";
                request_.pathname = "/v1/file/upgrade";
                request_.headers = TeaConverter.buildMap(
                    new TeaPair("host", _endpoint),
                    new TeaPair("content-type", "application/json"),
                    new TeaPair("x-Timestamp", timestamp),
                    new TeaPair("x-Nonce", nonce),
                    new TeaPair("x-AccessKey", accessKey),
                    new TeaPair("x-Signature", signature)
                );
                request_.body = Tea.toReadable(bodyStr);
                _lastRequest = request_;
                TeaResponse response_ = Tea.doAction(request_, runtime_, interceptorChain);

                java.util.Map<String, Object> result = com.aliyun.teautil.Common.assertAsMap(com.aliyun.teautil.Common.readAsJSON(response_.body));
                if (!com.aliyun.teautil.Common.equalNumber(response_.statusCode, 200)) {
                    throw new TeaException(TeaConverter.buildMap(
                        new TeaPair("statusCode", "" + response_.statusCode + ""),
                        new TeaPair("code", "" + result.get("code") + ""),
                        new TeaPair("message", "" + result.get("msg") + ""),
                        new TeaPair("docs", "" + result.get("docs") + ""),
                        new TeaPair("traceId", "" + result.get("traceId") + "")
                    ));
                }

                return TeaModel.toModel(TeaConverter.merge(Object.class,
                    result
                ), new FileUpgradeResponse());
            } catch (Exception e) {
                if (Tea.isRetryable(e)) {
                    _lastException = e;
                    continue;
                }
                throw e;
            }
        }
        throw new TeaUnretryableException(_lastRequest, _lastException);
    }

    public AppReportResponse AppReport(AppReportRequest request) throws Exception {
        TeaModel.validateParams(request, "request");
        java.util.Map<String, Object> runtime_ = TeaConverter.buildMap(
            new TeaPair("timeout", 10000)
        );

        TeaRequest _lastRequest = null;
        Exception _lastException = null;
        long _now = System.currentTimeMillis();
        int _retryTimes = 0;
        while (Tea.allowRetry((java.util.Map<String, Object>) runtime_.get("retry"), _retryTimes, _now)) {
            if (_retryTimes > 0) {
                int backoffTime = Tea.getBackoffTime(runtime_.get("backoff"), _retryTimes);
                if (backoffTime > 0) {
                    Tea.sleep(backoffTime);
                }
            }
            _retryTimes = _retryTimes + 1;
            try {
                TeaRequest request_ = new TeaRequest();
                // 序列化请求体
                String bodyStr = com.aliyun.teautil.Common.toJSONString(request);
                // 生成请求参数
                String timestamp = com.toolsetlink.darabonba.base.Client.timeRFC3339();
                String nonce = com.toolsetlink.darabonba.base.Client.generateNonce();
                String uri = "/v1/app/report";
                String accessKey = _accessKey;
                String accessSecret = _accessSecret;
                // 生成签名
                String signature = com.toolsetlink.darabonba.base.Client.generateSignature(bodyStr, nonce, accessSecret, timestamp, uri);
                request_.protocol = _protocol;
                request_.method = "POST";
                request_.pathname = "/v1/app/report";
                request_.headers = TeaConverter.buildMap(
                    new TeaPair("host", _endpoint),
                    new TeaPair("content-type", "application/json"),
                    new TeaPair("x-Timestamp", timestamp),
                    new TeaPair("x-Nonce", nonce),
                    new TeaPair("x-AccessKey", accessKey),
                    new TeaPair("x-Signature", signature)
                );
                request_.body = Tea.toReadable(bodyStr);
                _lastRequest = request_;
                TeaResponse response_ = Tea.doAction(request_, runtime_, interceptorChain);

                java.util.Map<String, Object> result = com.aliyun.teautil.Common.assertAsMap(com.aliyun.teautil.Common.readAsJSON(response_.body));
                if (!com.aliyun.teautil.Common.equalNumber(response_.statusCode, 200)) {
                    throw new TeaException(TeaConverter.buildMap(
                        new TeaPair("statusCode", "" + response_.statusCode + ""),
                        new TeaPair("code", "" + result.get("code") + ""),
                        new TeaPair("message", "" + result.get("msg") + ""),
                        new TeaPair("docs", "" + result.get("docs") + ""),
                        new TeaPair("traceId", "" + result.get("traceId") + "")
                    ));
                }

                return TeaModel.toModel(TeaConverter.merge(Object.class,
                    result
                ), new AppReportResponse());
            } catch (Exception e) {
                if (Tea.isRetryable(e)) {
                    _lastException = e;
                    continue;
                }
                throw e;
            }
        }
        throw new TeaUnretryableException(_lastRequest, _lastException);
    }

    public void addRuntimeOptionsInterceptor(RuntimeOptionsInterceptor interceptor) {
        interceptorChain.addRuntimeOptionsInterceptor(interceptor);
    }

    public void addRequestInterceptor(RequestInterceptor interceptor) {
        interceptorChain.addRequestInterceptor(interceptor);
    }

    public void addResponseInterceptor(ResponseInterceptor interceptor) {
        interceptorChain.addResponseInterceptor(interceptor);
    }

}
