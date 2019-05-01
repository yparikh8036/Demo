package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "demo")
public class Demo implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

//    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
//    @JsonIgnore
//    @JoinColumn(name = "demorel_id")
//    private DemoRel demoRel;

    @OneToMany(mappedBy = "demo",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DemoRel> demoRelList;

    public List<DemoRel> getDemoRelList() {
        return demoRelList;
    }

    public void setDemoRelList(List<DemoRel> demoRelList) {
        this.demoRelList = demoRelList;
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

    @Override
    public String toString() {
        return "Demo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", demoRelList=" + demoRelList +
                '}';
    }
}
