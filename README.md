# cs120dv

```kotlin
TODO("Configure publishing to Maven Central") 
```
### Maven

```xml
<dependency>
    <groupId>com.slateblua</groupId>
    <artifactId>cs120dv</artifactId>
    <version>0.0.1</version>
</dependency>
```
### Gradle

```kotlin
dependencies {
    implementation("com.slateblua:cs120dv:0.0.1")
}
```

### Sample usage

```java
public static void main(String[] args) {
    
    int[] xArgs = new int[] { 0, 1, 2, 3, 4 }; 
    int[] yArgs = new int[] { 0, 2, 4, 9, 16 }; 
    
    Scatterplot scatterplot = new Scatterplot(); 
    scatterplot.setXArgs(xArgs);
    scatterplot.setYArgs(yArgs); 
    
    JPlotter plot = new JPlotter(/* drawable = */ scatterplot); 
    
}
```
