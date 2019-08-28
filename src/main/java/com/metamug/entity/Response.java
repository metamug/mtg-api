package com.metamug.entity;

import java.io.InputStream;
import java.util.Map;

/**
 * Response return after processing the request
 */
public class Response {

    private Map<String, String> headers;
    private InputStream payload;
    private int status;

    public Response() {
    }

    public Response(Map<String, String> headers, InputStream payload) {
        this(payload);
        this.headers = headers;
    }

    public Response(InputStream payload) {
        this.payload = payload;
    }

    public void setHeader(String key, String value) {
        headers.put(key, value);
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public InputStream getPayload() {
        return this.payload;
    }

    public int getStatus() {
        return this.status;
    }
}
