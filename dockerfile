FROM azul/zulu-openjdk:17

WORKDIR /app

COPY target/badge-*.jar /app/badge.jar

EXPOSE 8080

CMD ["java", "-jar", "/app/badge.jar"]
