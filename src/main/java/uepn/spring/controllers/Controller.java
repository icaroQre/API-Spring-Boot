package uepn.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uepn.spring.domain.Student;
import uepn.spring.services.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public String get() {
        return "Hello World!";
    }

    @GetMapping("/variable/{valor}")
    public String getVariable(@PathVariable String valor) {
        return valor;
    }

    @GetMapping("/query")
    public String getQuery(@RequestParam String valor){
        return valor;
    }

    @GetMapping("/student")
    public List<Student> getAllStudent(){
        return studentService.getAllStudents();
    }

    @PostMapping("/student")
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }
}
