FROM openjdk:11-jdk-slim
EXPOSE 8086
ADD target/spring-boot-mysql.jar spring-boot-mysql.jar
ENTRYPOINT ["java","-jar","/spring-boot-mysql.jar"]