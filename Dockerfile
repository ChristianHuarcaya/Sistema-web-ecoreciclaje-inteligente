FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY pom.xml .
RUN ./mvnw -q -DskipTests dependency:resolve || true

COPY . .
RUN chmod +x mvnw && ./mvnw clean package -DskipTests


EXPOSE 8080

CMD ["sh", "-c", "java -Dserver.port=$PORT -jar target/*.jar"]
