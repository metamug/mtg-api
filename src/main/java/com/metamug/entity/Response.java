package com.metamug.entity;

import java.io.InputStream;
import java.util.Map;

/**
 * Response return after processing the request
 */
public class Response {

    private Map<String, String> headers;
    private InputStream body;
    private int status;

    public Response() {
    }

    public Response(Map<String, String> headers, InputStream body) {
        this(body);
        this.headers = headers;
    }

    public Response(InputStream body) {
        this.body = body;
    }

    public void setHeader(String key, String value) {
        headers.put(key, value);
    }

    public void setStatus(int status) {
        this.status = status;
    }

    /**
     *
     * @return InputStream allows response body to be a text or byte stream
     */
    public InputStream getBody() {
        return this.body;
    }

    public int getStatus() {
        return this.status;
    }
}
