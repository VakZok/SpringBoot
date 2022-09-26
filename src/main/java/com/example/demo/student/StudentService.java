package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

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
