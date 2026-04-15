<<<<<<< HEAD
FROM openjdk:21-jdk-alpine
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
COPY myprojectcicdmain.jar myprojectcicdmain.jar
EXPOSE 3000
ENTRYPOINT ["sh", "-c", "exec java $JAVA_OPTS -jar myprojectcicdmain.jar"]
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
#ENTRYPOINT ["sh", "-c", "exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar myprojectcicdmain.jar"]
=======
FROM eclipse-temurin:17

WORKDIR /app

COPY simple-java-app/src/Main.java .

RUN javac Main.java

CMD ["java", "Main"]
>>>>>>> 74413bd9fd85f6e07226218a5061be8f2f52a438
