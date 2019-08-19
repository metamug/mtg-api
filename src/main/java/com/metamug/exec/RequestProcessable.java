package com.metamug.exec;

import com.metamug.entity.Request;
import com.metamug.entity.Response;
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
     * @return Response Entity data in <code>String</code> format
     * @throws java.lang.Exception
     */
    public Response process(Request request, DataSource ds, Map<String,Object> bus, Map<String, String> args) throws Exception;
}
