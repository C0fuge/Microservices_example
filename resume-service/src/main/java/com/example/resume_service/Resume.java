package com.example.resume_service;

public class Resume {
    private String name;
    private String skills;
    private String desiredPosition;

    public Resume(String name, String skills, String desiredPosition) {
        this.name = name;
        this.skills = skills;
        this.desiredPosition = desiredPosition;
    }

    public String getName() {
        return name;
    }

    public String getSkills() {
        return skills;
    }
    public String getDesiredPosition() {
        return desiredPosition;
    }
}