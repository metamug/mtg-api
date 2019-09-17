package com.metamug.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * Response return after processing the request
 */
public class Response {

    private Map<String, String> headers;
    private Object body;
    private int status;

    public Response() {
    }

    public Response(Map<String, String> headers, Object body) throws ClassNotFoundException {
        this(body);    
        this.headers = headers;
    }
    
    public Response(Map<String, String> headers, String body) {
        this(body);
        this.headers = headers;
    }

    public Response(Object body) throws ClassNotFoundException {
        if(!(body instanceof DTO)){
            throw new ClassNotFoundException("Payload object does not implement DTO interface!");
        }
            
        this.body = body;
        this.headers = new HashMap<>();
    }
    
    public Response(String body) {
        this.body = body;
        this.headers = new HashMap<>();
    }

    public void setHeader(String key, String value) {
        headers.put(key, value);
    }

    public String getHeader(String key) {
        return headers.get(key);
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

  
    public void setPayload(Object body) {
        this.body = body;
    }

    /**
     *
     * @return InputStream allows response body to be a text or byte stream
     */
    public Object getPayload() {
        return this.body;
    }

    public int getStatus() {
        return this.status;
    }
}
