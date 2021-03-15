FROM openjdk:11
ADD target/payroll-service.jar payroll-service.jar
EXPOSE 8184
ENTRYPOINT ["java", "-jar", "payroll-service.jar"]