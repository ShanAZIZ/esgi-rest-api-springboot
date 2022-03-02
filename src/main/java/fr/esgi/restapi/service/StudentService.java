package fr.esgi.restapi.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.esgi.restapi.domain.Student;
import fr.esgi.restapi.repository.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService implements FindStudent, SaveStudent, DeleteStudent {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    /*
    * All find student methods
    * */

    @Override
    public Student findByFirstName(String firstName) {
        return this.studentRepository.findByFirstName(firstName);
    }

    @Override
    public Student findByLastName(String lastName) {
        return this.studentRepository.findByLastName(lastName);
    }

    @Override
    public List<Student> findAll() {
        return this.studentRepository.findAll();
    }

    /*
     * All save student methods
     * */

    @Override
    public Student save(Student student) {
        return this.studentRepository.save(student);
    }

    /*
     * All delete student methods
     * */

    @Override
    public void deleteStudentByFirstName(String firstName) {
        this.studentRepository.deleteByFirstName(firstName);
    }

    @Override
    public void deleteStudentBLastName(String lastName) {
        this.studentRepository.deleteByLastName(lastName);
    }
}
