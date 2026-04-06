FROM openjdk:17

WORKDIR /app

COPY simple-java-app/src/Main.java .

RUN javac Main.java

CMD ["java", "Main"]
