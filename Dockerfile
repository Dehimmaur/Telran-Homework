# Базовый образ с Java
FROM openjdk:17

# Создаём рабочую папку в контейнере
WORKDIR /app

# Копируем скомпилированный класс внутрь контейнера
COPY out/production/03_hw_2704_MaurinDenis/Main.class .

# Запускаем Java-приложение
CMD ["java", "Main"]