# Используем базовый образ OpenJDK 17
FROM openjdk:21-jdk-slim

# Устанавливаем рабочую директорию
WORKDIR /app

# Копируем jar-файл из директории target в контейнер
COPY target/*.jar app.jar

# Открываем порт 8080 для приложения
EXPOSE 8080

# Устанавливаем команду запуска приложения
ENTRYPOINT ["java", "-jar", "app.jar"]