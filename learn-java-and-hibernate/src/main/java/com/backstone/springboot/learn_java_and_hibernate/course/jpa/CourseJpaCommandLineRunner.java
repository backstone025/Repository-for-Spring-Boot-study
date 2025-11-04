package com.backstone.springboot.learn_java_and_hibernate.course.jpa;

import com.backstone.springboot.learn_java_and_hibernate.course.Course;
import com.backstone.springboot.learn_java_and_hibernate.course.jdbc.CourseJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn AWS Now!", "backstone"));
        repository.insert(new Course(2, "Learn Azure Now!", "backstone"));
        repository.insert(new Course(3, "Learn DevOps Now!", "backstone"));

        repository.deleteById(2);

        System.out.println(repository.findById(3));
    }
}
