package com.metamug.exec;

import java.util.Map;

public class Request {

    private final Map<String, String> params;
    private final Map<String, String> headers;
    
    private final String resourceName; 
    private final String  method;
    private final float version;

    protected Request(Map<String, String> params, Map<String, String> headers) {
        this.params = params;
        this.headers = headers;
    }
    
    public String getResourceName(){
        return this.resourceName;
    }
    
    public float getVersion{
        return this.version   
    }
    

    public String getMethod{
        return this.method;   
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
