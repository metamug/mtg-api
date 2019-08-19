package com.metamug.exec;

import com.metamug.entity.Response;
import java.util.SortedMap;

/**
 * 
 * @author themetamug
 */
public interface ResponseProcessable {
     /**
     * Performs operation response object from XRequest and other elements with Response
     *
     * @param response Response object resulting from XRequest
     * @return Response data
     * @throws java.lang.Exception
     */
    public Response process(Response response) throws Exception;
}
