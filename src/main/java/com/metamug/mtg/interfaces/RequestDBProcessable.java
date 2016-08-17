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
     * @return Manipulated data in <code>String</code> format
     */
    public String process(Map<String, String> param, DataSource ds);
}
