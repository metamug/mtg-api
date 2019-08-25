package com.metamug.entity;

import java.util.Map;

import java.util.Map;

/**
 *
 * @author deepak
 */
public class Request {

    private String uri, id, pid, uid, method, parent;
    private int statusCode;
    protected Map<String, String> params;

    public Request() {
    }

    /**
     * Copy Constructor
     *
     * @param request
     */
    public Request(Request request) {
        this.uri = request.uri;
        this.id = request.id;
        this.pid = request.pid;
        this.uid = request.uid;
        this.method = request.method;
        this.parent = request.parent;
        this.statusCode = request.statusCode;
        this.params = request.params;
    }

    public Request(String uri, String id, String method, Map<String, String> map) {
        this.uri = uri;
        this.id = id;
        this.method = method;
        this.params = map;
    }

    public void setDefault(String parameter, String defaultValue) {
        String param = params.get(parameter);
        if (param != null && !"".equals(param.trim())) {
            params.put(parameter, defaultValue);
        }
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Map<String, String> getParams() {
        return params;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getParameter(String param) {
        return params.get(param);
    }
}
