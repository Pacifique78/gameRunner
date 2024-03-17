package com.spring.part2.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoureseController {

    @RequestMapping("/courses")
    public List<Course> getAllCourses() {
        return Arrays.asList(new Course(1, "Javascript", "Paccy"),
                new Course(2, "Python", "Paccy"));
    }

}
