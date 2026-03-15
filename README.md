# Microservices System Example

Учебный проект: система из трех взаимодействующих микросервисов для симуляции работы платформы по поиску работы. 

## Архитектура

Система состоит из трех независимых модулей (Spring Boot):

1. **Resume Service (Port: 8081)** — Хранит профили пользователей и их навыки.
2. **Vacancy Service (Port: 8082)** — Управляет списком доступных вакансий на рынке.
3. **Notification Service (Port: 8083)** — Оркестратор (API Gateway). Делает межсервисные HTTP-запросы (через `RestClient`), собирает данные из первых двух сервисов и формирует итоговый персонализированный ответ.

## Стек технологий
* **Java 21**
* **Spring Boot 3.4.x** (Spring Web)
* **REST API** (JSON, Jackson)
* **Maven**

## Как запустить локально
1. Клонировать репозиторий: `git clone https://github.com/User-name/Microservices-example.git`
2. Запустить по очереди `ResumeServiceApplication` и `VacancyServiceApplication`.
3. Запустить `NotificationServiceApplication`.
4. Открыть в браузере: `http://localhost:8083/api/check-updates`
