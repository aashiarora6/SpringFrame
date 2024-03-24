package com.springboot.app;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent(){
        return new Student("Aashi", "Arora");
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Aashi", "Arora"));
        students.add(new Student("Arnav", "Arora"));
        students.add(new Student("Raju", "Arora"));
        students.add(new Student("Rishabh", "Arora"));
        students.add(new Student("Nupur", "Arora"));
        return students;
    }

    @GetMapping("/student/{firstName}/{lastName}")
    public Student studentPathVariable(@PathVariable("firstName") String firstName,@PathVariable("lastName") String lastName){
        return new Student(firstName, lastName);
    }
}
