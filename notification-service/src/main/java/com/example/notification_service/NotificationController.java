package com.example.notification_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
public class NotificationController {

    @GetMapping("/api/check-updates")
    public String checkUpdates() {
        RestClient restClient = RestClient.create();

        System.out.println("Запрос данных профиля.");
        String resumeData = restClient.get().uri("http://localhost:8081/api/my-resume").retrieve().body(String.class);

        System.out.println("Запрос списка вакансий.");
        String vacanciesData = restClient.get().uri("http://localhost:8082/api/vacancies").retrieve().body(String.class);

        String finalReport = "Твое резюме: " + resumeData + " --- Для тебя найдены вакансии: " + vacanciesData;

        System.out.println("Успешно собрали данные со всех сервисов!");
        return finalReport;
    }
}