package com.example.vacancy_service;

public class Vacancy {
    private String title;
    private String company;
    private int salary;

    public Vacancy(String title, String company, int salary) {
        this.title = title;
        this.company = company;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }
    
    public String getCompany() {
        return company;
    }

    public int getSalary() {
        return salary;
    }
}