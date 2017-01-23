/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metamug.exec;

import java.util.Map;
import javax.sql.DataSource;

/**
 *
 * @author Kaisteel
 */
public interface RequestProcessable {

    /**
     *
     * @param param Map of parameters passed during HTTP request
     * @param ds DataSource object to connect with Database
     * @param requestHeaders HTTP Request Header array.
     * @return Manipulated data in <code>String</code> format
     */
    public Object process(Map<String, String> param, DataSource ds, Map<String, String> requestHeaders);
}
