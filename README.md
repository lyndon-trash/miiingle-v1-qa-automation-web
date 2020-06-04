# Miiingle.NET Web QA Automation and Test Assist
This is a multi-purpose project:
- a microservice for poking inside the cluster and manipulation of the database in the name of test setup
- a microservice for hosting the test results
- a collection of API test suite
- another collection of Web Test suite

## Run
```
gradlew clean test allureReport bootJar
java -jar build\libs\qa-automation-web-0.0.1-SNAPSHOT.jar
```