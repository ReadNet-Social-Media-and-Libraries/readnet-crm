FROM openjdk:17
EXPOSE 8080
ADD target/readnet-crm-application.jar readnet-crm-application.jar
ENTRYPOINT ["java", "-jar", "/readnet-crm-application.jar"]