FROM openjdk:8
EXPOSE 8006
ADD target/e2eJen-0.0.1-SNAPSHOT.jar Jen.jar
ENTRYPOINT ["java","-jar","/Jen.jar"]