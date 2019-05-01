package com.example.demo.domain;

import javax.persistence.*;

@Entity
@Table(name="demo")
public class Demo {

    @Id
    @GeneratedValue
    @Column(name = "id" )
    private Long id;

    @Column(name = "name" )
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "demorel_id")
    private DemoRel demoRel;

    public DemoRel getDemoRel() {
        return demoRel;
    }

    public void setDemoRel(DemoRel demoRel) {
        this.demoRel = demoRel;
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
