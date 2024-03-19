package com.prosigmaka.model;

import jakarta.persistence.*;

import javax.swing.*;
import java.util.Objects;

@Entity

public class PersonModel {
    @Id
    @SequenceGenerator(
            name = "person_id_sequence",
            sequenceName = "person_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "person_id_sequence"
    )
    private Integer id;
    private String name;
    private String email;
    private Integer age;
    private String test;

    public void PersonModel(Integer id,
                  String name,
                  String email,
                  Integer age,
                  String test) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.test = test;
    }

    public void PersonModel(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonModel person = (PersonModel) o;
        return Objects.equals(id, person.id) && Objects.equals(name, person.name) && Objects.equals(email, person.email) && Objects.equals(age, person.age) && Objects.equals(test, person.test);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, age, test);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", test='" + test + '\'' +
                '}';
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
