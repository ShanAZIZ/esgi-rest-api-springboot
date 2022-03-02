package fr.esgi.restapi.repository;

import fr.esgi.restapi.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FakeStudentRepository implements StudentRepository {

    private List<Student> students;

    private void initFakeStudentList(){
        this.students = new ArrayList<>();
        this.students.add(new Student("Shana", "AZIZ"));
        this.students.add(new Student("Mohammed", "MILI"));
    }

    public FakeStudentRepository() {
        this.initFakeStudentList();
    }

    @Override
    public Student findByFirstName(String firstName) {
        for(Student student : this.students){
            if(student.getFirstName().equals(firstName)){
                return student;
            }
        };
        return null;
    }

    @Override
    public Student findByLastName(String lastName) {
        for(Student student : this.students){
            if(student.getFirstName().equals(lastName)){
                return student;
            }
        }
        return null;
    }

    @Override
    public List<Student> findAll() {
        return this.students;
    }

    @Override
    public Student save(Student student) {
         this.students.add(student);
        return student;
    }

    @Override
    public void deleteByFirstName(String firstName) {
        for(Student student : this.students){
            if(student.getFirstName().equals(firstName)){
                this.students.remove(student);
            }
        }
    }

    @Override
    public void deleteByLastName(String lastName) {
        for(Student student : this.students){
            if(student.getFirstName().equals(lastName)){
                this.students.remove(student);
            }
        }
    }
}
