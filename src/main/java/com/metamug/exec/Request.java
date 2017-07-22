package com.metamug.exec;

import java.util.Map;

public class Request {

    private final Map<String, String> params;
    private final Map<String, String> headers;

    protected Request(Map<String, String> params, Map<String, String> headers) {
        this.params = params;
        this.headers = headers;
    }

    public String getHeader(String header) {
        return headers.get(header);
    }

    public String getParameter(String param) {
        return params.get(param);
    }

    public void setHeader(String key, String value) {
        headers.put(key, value);
    }

    public void setParamter(String key, String value) {
        params.put(key, value);
    }

}
