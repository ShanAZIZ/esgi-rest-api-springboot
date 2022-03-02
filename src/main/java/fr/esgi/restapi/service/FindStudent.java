package fr.esgi.restapi.service;

import fr.esgi.restapi.domain.Student;

import java.util.List;

public interface FindStudent {
    public Student findByFirstName(String firstName);
    public Student findByLastName(String lastName);
    public List<Student> findAll();
}
