package com.backstone.springboot.learn_java_and_hibernate.course;

import com.backstone.springboot.learn_java_and_hibernate.course.Course;
import com.backstone.springboot.learn_java_and_hibernate.course.jpa.CourseJpaRepository;
import com.backstone.springboot.learn_java_and_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn AWS Now!", "backstone"));
        repository.save(new Course(2, "Learn Azure Now!", "backstone"));
        repository.save(new Course(3, "Learn DevOps Now!", "backstone"));

        repository.deleteById(2l);

        System.out.println(repository.findById(3l));

        // additional cmd
        System.out.println(repository.findAll());
        System.out.println(repository.count());

        System.out.println(repository.findByAuthor("backstone"));
        System.out.println(repository.findByAuthor(""));
        System.out.println(repository.findByName("Learn DevOps Now!"));
    }
}
