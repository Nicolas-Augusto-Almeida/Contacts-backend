# Etapa 1: Build da aplicação com Maven
FROM maven:3.9.4-eclipse-temurin-21-alpine AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Etapa 2: Imagem para execução da aplicação
FROM eclipse-temurin:21-jdk-alpine
COPY --from=build /app/target/contacts-backend-0.0.1-SNAPSHOT.jar /app/app.jar

EXPOSE 80 8080

ENTRYPOINT ["java", "-jar", "/app/app.jar"]
