# AssertJ jar classpath nested class problem example
 
## Main Problem

The problem is in [ClassUtil](https://github.com/joel-costigliola/assertj-assertions-generator/blob/master/src/main/java/org/assertj/assertions/generator/util/ClassUtil.java#L119). 
This code is looking only for top level classes and it ignores all nested classes. 

### Working configuration: 

* `mvn clean test-compile` - no compilation error

In `test-compile` stage `tests` module classpath is: 
`file:/.../assertj-jar-classpath-nested-class-problem/commons/target/target/classes/io/eroshenkoam/assertj`
In this case classes loaded from directory classpath.

### Not working configuration: 

* `mvn clean package` - compilation error

In `package` stage `tests` module classpath is: 
`file:/.../assertj-jar-classpath-nested-class-problem/commons/target/client-1.0-SNAPSHOT.jar!/io/eroshenkoam/assertj`
In this case classes loaded from jar classpath and we have the problem.
