/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metamug.mtg.interfaces;

import java.util.Map;
import javax.sql.DataSource;

/**
 *
 * @author Kaisteel
 */
public interface RequestDBProcessable {

    /**
     *
     * @param param Map of parameters passed during HTTP request
     * @param ds DataSource object to connect with Database
     * @return
     */
    public String process(Map<String, String> param, DataSource ds);
}
