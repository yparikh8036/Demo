package com.example.demo.service.dto;

public class DemoDTO {

    private Long id;
    private String name;
    private Long demorelId;

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


}
