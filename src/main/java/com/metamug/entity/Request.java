package com.metamug.entity;

import java.util.Map;

public class Request {

    private final Map<String, String> params;
    private final Map<String, String> headers;
    private final String method;
    private final Resource resource;

    public Request(Map<String, String> params, Map<String, String> headers, String method, Resource resource) {
        this.params = params;
        this.headers = headers;
        this.resource = resource;
        this.method = method;
    }

    public String getMethod() {
        return this.method;
    }

    /**
     * Get information about the requested resource
     *
     * @return Resource resource object
     */
    public Resource getResource() {
        return this.resource;
    }

    public String getHeader(String header) {
        return headers.get(header);
    }

    public String getParameter(String param) {
        return params.get(param);
    }

    /**
     * Set Header into the request.
     *
     * @param key name of the header
     * @param value of the header
     */
    public void setHeader(String key, String value) {
        headers.put(key, value);
    }

    /**
     * Set Header into the request.
     *
     * @param key name of the request parameter
     * @param value of the request parameter
     */
    public void setParamter(String key, String value) {
        params.put(key, value);
    }

}
