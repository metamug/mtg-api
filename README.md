[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.metamug.exec/metamug-api/badge.svg)](http://search.maven.org/#artifactdetails|com.metamug.exec|metamug-api|1.1.1|)

# mtg-api
Metamug Code Execution Dependency

```
<dependency>
    <groupId>com.metamug.exec</groupId>
    <artifactId>metamug-api</artifactId>
    <version>1.1.1</version>
</dependency>
```

## Result Processing

```
interface ResultProcessable {
    public Object process(SortedMap[] rowMap, String[] columnNames, int rowCount);
}
```
Supply the fully qualified class name to classname attribute of Query tag. 

```
<Request method="GET">
	<Query classname="com.mycompany.handlers.Shortener" >
	    SELECT id FROM urls WHERE url=$q
	</Query>
</Request>
```

## Request Handling

```
 public interface RequestProcessable {
        public Object process(Map<String, String> param, DataSource ds, 
        Map<String, String> requestHeaders);
}
```
Use the execute tag inside Request directly to execute code to process the incoming request.

```
<Request method="GET">
    <Execute classname="com.mycompany.schedular.Schedule" />
</Request>
```

