package com.example.vacancy_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class VacancyController {

    @GetMapping("/api/vacancies")
    public ArrayList<Vacancy> getAllVacancies() {
        ArrayList<Vacancy> vacancies = new ArrayList<>();

        vacancies.add(new Vacancy("Junior Java Developer", "Сбер", 80000));
        vacancies.add(new Vacancy("Middle Backend Engineer", "Яндекс", 150000));
        vacancies.add(new Vacancy("Стажер-программист", "VK", 50000));

        return vacancies;
    }
}