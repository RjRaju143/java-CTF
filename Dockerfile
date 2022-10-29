# FROM openjdk:11-jdk-slim
FROM openjdk

# RUN apt update 
# RUN apt -y install maven
# RUN apt -y python
# RUN apt -y netcat
# RUN apt -y wget
# RUN apt -y curl

RUN mkdir -p /opt/text4shell-poc

WORKDIR /opt/text4shell-poc

# Compile
COPY pom.xml ./
COPY target/ ./target/

# RUN mvn clean package -DskipTests

EXPOSE 8000
CMD ["java", "-jar", "target/bot-server-0.1.jar"]
