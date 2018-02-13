package com.metamug.exec;


public class Resource {
  
    private final String name, role; 
    private final float version;

    protected Resource(String name, String role, float version){
      this.name = name;
      this.version = version;
    }
  
    /**
    * @return name of the resource.
    */
    public String getName(){
        return this.name;
    }
    
    /**
    * @return version number of the resource
    */
    public float getVersion(){
        return this.version;   
    }
    
    /**
    * Get the role defined in the auth attribute of the resource file.
    */
    public String getRole(){
        return this.role;
    }
  
}
