package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student") //localhost:8080/api/v1/student
public class StudentController {
    @GetMapping
    public List<Student> getStudent() {
        return List.of(
                new Student(
                        1L,
                        "Maja",
                        "maja.dieckmann@gmx.de",
                        LocalDate.of(1999, Month.OCTOBER, 27),
                        21
                )
        );
    }
}
