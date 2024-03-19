package com.springboot.learnjpaandhobernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.learnjpaandhobernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    // @Autowired
    // private CourseJdbcRepository repository;

    // @Autowired
    // private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn AWS", "paccy"));
        repository.save(new Course(2, "Learn Azure", "paccy"));
        repository.save(new Course(3, "Learn Devops", "Tuyi"));
        repository.deleteById(1l);
        System.out.println(repository.findById(2l));
        System.out.println(repository.findByAuthor("paccy"));
        System.out.println(repository.findByAuthor(""));
        System.out.println(repository.findByName("Learn Devops"));
    }

}
