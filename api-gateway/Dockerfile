FROM openjdk:17-jdk

ADD target/*.jar apigateway

ENTRYPOINT ["java", "-jar", "apigateway"]

EXPOSE 8765