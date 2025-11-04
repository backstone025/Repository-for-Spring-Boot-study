package com.backstone.springboot.learn_java_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    @Autowired
    public JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY =
            """
                insert into course (id, name, author)
                values (1, 'learn AWS', 'backstone')
            """;

    public void insert() {
        springJdbcTemplate.update(INSERT_QUERY);
    }
}
