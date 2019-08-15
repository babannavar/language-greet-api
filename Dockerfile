# Start with a base image containing Java runtime
FROM java:8-jdk-alpine

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 8080

# The application's jar file
ARG JAR_FILE=target/language-greet-api.jar

# Add the application's jar to the container
ADD ${JAR_FILE} language-greet-api.jar

# Run the jar file
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/language-greet-api.jar"]
