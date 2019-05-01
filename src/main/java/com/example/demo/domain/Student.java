package com.example.demo.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "student")
public class Student {


    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToOne
    @JoinColumn(name = "schoolbag_id")
    private SchoolBag schoolBag;

    @OneToMany(mappedBy = "student")
    private Set<Book> books;

    @ManyToMany
    @JoinTable(
            name = "student_teacher1",
            joinColumns = {@JoinColumn(name = "student_id")},
            inverseJoinColumns = {@JoinColumn(name = "teacher_id")}
    )
    private Set<Teacher> teachers = new HashSet<>();

    public Set<Teacher> getTeachers() {
        return teachers;
    }


    public void setTeachers(Set<Teacher> teachers) {
        this.teachers = teachers;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }


    public SchoolBag getSchoolBag() {
        return schoolBag;
    }

    public void setSchoolBag(SchoolBag schoolBag) {
        this.schoolBag = schoolBag;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
