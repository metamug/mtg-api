
package com.metamug.entity;


public class Resource {
  
    private final String name, role, url, parent; 
    private final float version;

    protected Resource(String name, String role, float version, String url, String parent){
      this.name = name;
      this.version = version;
      this.role = role;
      this.url = url;
      this.parent = parent;
    }
    
    /**
    * @return resource URL
    */
    public String getUrl(){
      return this.url; 
    }
    
    /**
    * @return parent of this resource
    */
    public String getParent(){
      return this.parent;
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
