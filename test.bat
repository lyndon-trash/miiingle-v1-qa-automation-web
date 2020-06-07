call gradlew clean test
call gradlew allureReport
call gradlew bootJar -x test
call start chrome http://localhost:8999/docs/index.html
call java -jar build\libs\qa-automation-web-1.0.0.jar
