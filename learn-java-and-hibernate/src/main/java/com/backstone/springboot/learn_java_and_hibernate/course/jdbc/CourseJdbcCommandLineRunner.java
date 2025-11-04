package com.backstone.springboot.learn_java_and_hibernate.course.jdbc;

import com.backstone.springboot.learn_java_and_hibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn AWS Now!", "backstone"));
        repository.insert(new Course(2, "Learn Azure Now!", "backstone"));
        repository.insert(new Course(3, "Learn DevOps Now!", "backstone"));

        repository.deleteByID(2);

        System.out.println(repository.findByID(3));
    }
}
