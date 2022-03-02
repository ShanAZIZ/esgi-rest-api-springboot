package fr.esgi.restapi.repository;

import fr.esgi.restapi.domain.Student;

import java.util.List;

public interface StudentRepository {

    public Student findByFirstName(String firstName);
    public Student findByLastName(String lastName);
    public List<Student> findAll();
    public Student save(Student student);
    public void deleteByFirstName(String firstName);
    public void deleteByLastName(String lastName);

}
