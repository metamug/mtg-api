[![Build Status](https://travis-ci.org/metamug/mtg-api.svg?branch=master)](https://travis-ci.org/metamug/mtg-api) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.metamug/mtg-api/badge.svg)](http://search.maven.org/#artifactdetails|com.metamug|mtg-api|1.1.2|)

# mtg-api
Metamug Code Execution Dependency

```xml
<dependency>
    <groupId>com.metamug</groupId>
    <artifactId>mtg-api</artifactId>
    <version>1.1.2</version>
</dependency>
```

### Result Processing

```java
interface ResultProcessable {
    public Object process(SortedMap[] rowMap, String[] columnNames, int rowCount);
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
 public interface RequestProcessable {
        public Object process(Map<String, String> param, DataSource ds,
        Map<String, String> requestHeaders);
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
The uploaded file can be accessed from event object.

```java
public interface UploadListener {
    public Object uploadPerformed(UploadEvent event, DataSource dataSource);

}
```

#Install lastest dependency

```sh
git clone https://github.com/metamug/mtg-api.git
mvn clean install
```

Read more here. [Metamug Code Execution](https://metamug.com/docs/code-execution.php)
