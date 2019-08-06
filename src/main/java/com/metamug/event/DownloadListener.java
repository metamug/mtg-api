/*
 * Copyright 2019 anishhirlekar.
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
package com.metamug.event;

import java.io.InputStream;
import javax.sql.DataSource;

/**
 *
 * @author anishhirlekar
 */
public interface DownloadListener {
        
    /**
     * Callback method for File download event. File download event occurs on receiving GET request with header Accept: application/octet-stream 
     *
     * @param event DownloadEvent
     * @param dataSource DataSource object to connect with Database
     * @return Returned object will be java.io.File which will be streamed in the response
     * @throws java.lang.Exception
     */
    public InputStream onDownloadRequest(DownloadEvent event, DataSource dataSource) throws Exception;  
}