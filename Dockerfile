FROM maven:3.8.6-openjdk-18 as build
COPY src myapp/src
COPY pom.xml /myapp/pom.xml
WORKDIR /myapp
RUN mvn clean package -DskipTests
CMD [ "java", "-jar", "target/demo-0.0.1-SNAPSHOT.jar" ]