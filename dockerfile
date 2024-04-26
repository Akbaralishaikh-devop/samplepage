FROM openjdk:17
WORKDIR /automation
COPY . .
EXPOSE 9082
ADD target/Sample-0.0.1-SNAPSHOT.jar /Sample-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "/Sample-0.0.1-SNAPSHOT.jar" ]
