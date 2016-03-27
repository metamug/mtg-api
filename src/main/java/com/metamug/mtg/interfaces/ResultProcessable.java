package com.metamug.mtg.interfaces;

import java.util.SortedMap;

/**
 *
 * @author Kainix
 */
public interface ResultProcessable {

    /**
     *
     * @param rowMap The SortedMap object key is the ColumnName and the value is the ColumnValue
     * @param columnNames The array represents the names of the columns
     * @param rowCount The number of rows
     * @return
     */
    public String process(SortedMap[] rowMap, String[] columnNames, int rowCount);

}
