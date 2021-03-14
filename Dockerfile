FROM openjdk:11
ADD target/payroll-service.jar payroll-service.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "payroll-service.jar"]