package com.example.resume_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResumeController {

    @GetMapping("/api/my-resume")
    public Resume getMyResume() {
        return new Resume("Максим", "Java, Spring Boot, ООП, C, C++, Linux",
                "Junior Backend Developer");
    }
}