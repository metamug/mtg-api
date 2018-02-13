package com.metamug.exec;

import java.util.Map;

public class Resource {
  
    private final String name, role; 
    private final float version;

    protected Resource(String name, float version){
      this.name = name;
      this.version = version;
    }
    
    public String getName(){
        return this.name;
    }
    
    public float getVersion{
        return this.version   
    }
    
    /**
    * Get the role defined in the auth attribute of the resource file.
    */
    public String getRole(){
        retun this.role
    }
  
}
