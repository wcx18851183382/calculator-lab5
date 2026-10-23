# ================= Stage 1: build 编译阶段 =================
FROM maven:3.8-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src
RUN mvn -B package

# ================= Stage 2: runtime 运行阶段（这里改镜像） =================
FROM eclipse-temurin:17-jre-alpine
COPY --from=build /app/target/calculator-1.0.0.jar /app/calculator.jar
WORKDIR /app
ENTRYPOINT ["java", "-jar", "calculator.jar"]
