/*
 * Copyright 2019 pc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.metamug.entity;

import java.util.Map;

/**
 * SQL Query Result
 *
 * @author themetamug
 */
public class Result {

    Map[] rowMap;
    String[] columnNames;
    int rowCount;

    public Result(Map[] rowMap, String[] columnNames, int rowCount) {
        this.rowMap = rowMap;
        this.columnNames = columnNames;
        this.rowCount = rowCount;
    }

    
    
    public Map[] getRowMap() {
        return rowMap;
    }

    public void setRowMap(Map[] rowMap) {
        this.rowMap = rowMap;
    }

    public String[] getColumnNames() {
        return columnNames;
    }

    public void setColumnNames(String[] columnNames) {
        this.columnNames = columnNames;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

}
