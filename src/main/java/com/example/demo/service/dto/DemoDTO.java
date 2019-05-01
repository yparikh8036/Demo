package com.example.demo.service.dto;

public class DemoDTO {

    private Long id;
    private String name;
    private Long demorelId;
    private String demorelName;

    public Long getDemorelId() {
        return demorelId;
    }

    public void setDemorelId(Long demorelId) {
        this.demorelId = demorelId;
    }

     public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDemorelName() {
        return demorelName;
    }

    public void setDemorelName(String demorelName) {
        this.demorelName = demorelName;
    }
}
