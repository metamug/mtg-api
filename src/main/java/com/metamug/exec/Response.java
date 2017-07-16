package com.metamug.exec;

/**
* Response return after processing the request
*/
public class Response{
  
  private Map<String, String> headers;
  private Object payload;
  private int status;
  
  public Response(){
  }
  
  public Response(Map<String, String> headers, Object payload){
    this.headers = headers;
    this.payload = payload;
  }
  
  
  public setHeader(String key, String value){
    headers.put(key, value);
  }
  
  public setStatus(int status){
    this.status = status;
  }
}
