# Usa una imagen base con Java
FROM openjdk:17-jdk-slim

# Establece el directorio de trabajo
WORKDIR /app

# Copia el JAR generado por Maven al contenedor
COPY target/transporting_robot_service-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto
EXPOSE 8084

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
