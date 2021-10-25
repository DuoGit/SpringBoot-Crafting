#FROM maven:alpine
#COPY src pom.xml /app/
#RUN mvn -f /app/pom.xml clean package
#
#FROM openjdk:8-jre-alpine
#ENTRYPOINT ["java","-jar","/app/target/\*.jar"]

FROM openjdk:8-jdk-alpine
WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline

COPY src ./src
CMD ["./mvnw", "spring-boot:run"]

#FROM openjdk:8-jre-alpine
#COPY target/*.jar ./app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]

#FROM maven:alpine
#WORKDIR /home/app/
#COPY src pom.xml ./
#RUN mvn -f pom.xml clean package
#
#FROM openjdk:8-jre-alpine
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","/home/app/target/*.jar"]