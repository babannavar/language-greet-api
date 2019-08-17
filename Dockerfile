
FROM alpine/git as clone
WORKDIR /app
RUN git clone https://github.com/babannavar/language-greet-api.git

FROM maven:3.5-jdk-8-alpine as build
ARG PROJECT=language-greet-api
WORKDIR /app/${PROJECT}
COPY --from=clone /app/${PROJECT} /app/${PROJECT}
RUN mvn package

FROM openjdk:8-jre-alpine
ARG PROJECT=language-greet-api
WORKDIR /app/${PROJECT}
COPY --from=build /app/${PROJECT}/target/${PROJECT}.jar /app/${PROJECT}
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/${PROJECT}/${PROJECT}.jar"]

# Start with a base image containing Java runtime
#FROM java:8-jdk-alpine

# Add a volume pointing to /tmp
#VOLUME /tmp

# Make port 8080 available to the world outside this container
#EXPOSE 8080

# The application's jar file
#ARG JAR_FILE=target/language-greet-api.jar

# Add the application's jar to the container
#ADD ${JAR_FILE} language-greet-api.jar

# Run the jar file
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/language-greet-api.jar"]
