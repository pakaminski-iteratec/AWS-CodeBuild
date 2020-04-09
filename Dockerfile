FROM openjdk:8-jre-alpine

ADD target/aws-test*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar" ]
