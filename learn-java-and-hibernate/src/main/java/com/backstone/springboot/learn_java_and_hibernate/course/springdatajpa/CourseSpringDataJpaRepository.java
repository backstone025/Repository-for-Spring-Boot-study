package com.backstone.springboot.learn_java_and_hibernate.course.springdatajpa;

import com.backstone.springboot.learn_java_and_hibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
}
