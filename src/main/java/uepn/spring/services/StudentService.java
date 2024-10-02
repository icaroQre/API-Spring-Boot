package uepn.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uepn.spring.domain.Student;
import uepn.spring.repositories.StudentRepository;

import java.util.List;

@Service

public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student getStudent(){
        Student student = new Student();

        student.setName("Ícaro");
        student.setAge(20);
        student.setCourse("Ciência da Computação");

        return student;
    }

    public Student createStudent (Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }
}
