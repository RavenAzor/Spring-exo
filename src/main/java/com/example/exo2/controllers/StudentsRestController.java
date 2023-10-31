package com.example.exo2.controllers;

import com.example.exo2.model.Students;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentsRestController {

    @GetMapping // GET http://localhost:8082/api/v1/students
    public List<String> getAllStudents(){
        return List.of("Caitlyn", "Vi", "Jinx");
    }

    @GetMapping("/{id}") // GET http://localhost:8082/api/v1/students/x
    public String getOneStudent(@PathVariable int id){
        return "Student id : " + id;
    }

    @PostMapping // POST http://localhost:8082/api/v1/students
    public Students create(@RequestBody Students students){
        return students;
    }

    @DeleteMapping("/{id}") // DELETE http://localhost:8082/api/v1/students/x
    public String deleteStudent(@PathVariable int id){
        return "Deleting Student with id : " + id;
    }

    @PutMapping("/{id}") // DELETE http://localhost:8082/api/v1/students/x
    public String updateStudent(@PathVariable int id){
        return "Updating Student with id : " +id;
    }
}
