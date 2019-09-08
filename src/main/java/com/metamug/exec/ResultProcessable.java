package com.metamug.exec;

import com.metamug.entity.Response;
import com.metamug.entity.Result;
import java.util.Map;
import java.util.SortedMap;

/**
 *
 * @author Kainix
 */
public interface ResultProcessable {

    /**
     * Performs operation on data received from SELECT statement
     *
     * @param rowMap The SortedMap object key is the ColumnName and the value is
     * the ColumnValue
     * @param columnNames The array represents the names of the columns
     * @param rowCount The number of rows
     * @return Response data
     * @throws java.lang.Exception
     */
    public Response process(Result queryResult) throws Exception;
}
