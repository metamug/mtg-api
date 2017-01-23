package com.metamug.exec;

import java.util.SortedMap;

/**
 *
 * @author Kainix
 */
public interface ResultProcessable {

    /**
     * Performs operation on data received from SELECT statement
     *
     * @param rowMap The SortedMap object key is the ColumnName and the value is the ColumnValue
     * @param columnNames The array represents the names of the columns
     * @param rowCount The number of rows
     * @return Manipulated data in <code>String</code> format
     */
    public Object process(SortedMap[] rowMap, String[] columnNames, int rowCount);

}
