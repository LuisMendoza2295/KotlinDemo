FROM openjdk:11-jre-slim
WORKDIR /usr/bin/app/micronaut-kotlin
COPY /build/libs/micronaut-demo-0.1-all.jar micronaut-demo.jar
EXPOSE 8080
CMD ["java", "-jar", "micronaut-demo.jar"]
