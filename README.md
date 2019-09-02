[![Build Status](https://travis-ci.org/metamug/api-sdk.svg?branch=master)](https://travis-ci.org/metamug/api-sdk) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.metamug/mtg-api/badge.svg)](http://search.maven.org/#artifactdetails|com.metamug|mtg-api|1.1.2|)

# mtg-api
Metamug Code Execution Dependency

```xml
<dependency>
    <groupId>com.metamug</groupId>
    <artifactId>mtg-api</artifactId>
    <version>1.2.0</version>
</dependency>
```

### Result Processing

```java
package com.mycompany.handlers;

public class Shortener implements ResultProcessable {
    public Object process(SortedMap[] rowMap, String[] columnNames, int rowCount) throws Exception{
    	//TODO
    }
}
```
Supply the fully qualified class name to classname attribute of Query tag.

```xml
<Request method="GET">
    <Query classname="com.mycompany.handlers.Shortener" >
        SELECT id FROM urls WHERE url=$q
    </Query>
</Request>
```

### Request Handling

```java
 public class Schedule implements RequestProcessable {
    public Object process(Map<String, String> param, DataSource ds, Map<String, String> requestHeaders) throws Exception{
	//TODO		
    }
}
```
Use the execute tag inside Request directly to execute code to process the incoming request.

```xml
<Request method="GET">
    <Execute classname="com.mycompany.schedular.Schedule" />
</Request>
```
# Event

Event Handlers are invoked implicitly. They need not be referenced from resource xml.

### Upload Event

When Upload is performed, the class implemented with following interface is invoked.
The uploaded file can be accessed from event object. The upload event is an implicit element
which returns a response to the bus.

```java
public CSVUploader implements UploadListener {
    public Object uploadPerformed(UploadEvent event, DataSource dataSource) throws Exception{
        //TODO 
    }
    
}
```
### Timer Event

The Timer Event listener continues to execute after the specified interval. 

```java

@Timer(tick=1000, start=24000)
public Schedular implement TimerListener{
      
     @Override
     public Object timerTriggered(TimerEvent event, DataSource dataSource){
     	//TODO
     }
}

```
If the `@Timer` annotation is not provided, by default the timer triggers after every 10 seconds.
The timer can have a delayed start, here we have configured the delay to be 24 seconds.

# Install lastest dependency

```sh
git clone https://github.com/metamug/mtg-api.git
mvn clean install
```

Read more here. [Metamug Code Execution](https://metamug.com/docs/code-execution.php) 
