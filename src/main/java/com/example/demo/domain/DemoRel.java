package com.example.demo.domain;

import javax.persistence.*;

@Entity
@Table(name = "demorel")
public class DemoRel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    private Demo demo;

    public Demo getDemo() {
        return demo;
    }

    public void setDemo(Demo demo) {
        this.demo = demo;
    }

    public DemoRel(String name, Demo demo) {
        this.name = name;
        this.demo = demo;
    }

    public DemoRel(){}

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

    @Override
    public String toString() {
        return "DemoRel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
