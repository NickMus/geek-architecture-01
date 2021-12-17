package ru.geekbrains.domain;

import java.util.Map;

public class HttpRequest {

    private String method;

    private String url;

    private Map<String, String> headers;

    private String body;

//    public HttpRequest(String method, String url, Map<String, String> headers, String body) {
//        this.method = method;
//        this.url = url;
//        this.headers = headers;
//        this.body = body;
//    }

    public String getMethod() {
        return method;
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
        return "HttpRequest{" +
                "method='" + method + '\'' +
                ", url='" + url + '\'' +
                ", headers=" + headers +
                ", body='" + body + '\'' +
                '}';
    }

    public static class Builder {
        private HttpRequest httpRequest;

        public Builder() {
            httpRequest = new HttpRequest();
        }
        public Builder withMethod(String method) {
            httpRequest.method = method;
            return this;
        }
        public Builder withUrl(String url) {
            httpRequest.url = url;
            return this;
        }
        public Builder withHeaders(Map<String, String> headers) {
            httpRequest.headers = headers;
            return this;
        }
        public Builder withBody(String body) {
            httpRequest.body = body;
            return this;
        }
        public HttpRequest build() {
            return httpRequest;
        }
    }
}
