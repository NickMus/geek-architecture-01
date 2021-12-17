package ru.geekbrains.domain;

import java.util.Map;

public class HttpResponse {
    private final String code;

    private final String url;

    private final Map<String, String> headers;

    private final String body;

    public HttpResponse(String code, String url, Map<String, String> headers, String body) {
        this.code = code;
        this.url = url;
        this.headers = headers;
        this.body = body;
    }

    public String getCode() {
        return code;
    }

    public String getUrl() {
        return url;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "HttpResponse{" +
                "method='" + code + '\'' +
                ", url='" + url + '\'' +
                ", headers=" + headers +
                ", body='" + body + '\'' +
                '}';
    }
}
