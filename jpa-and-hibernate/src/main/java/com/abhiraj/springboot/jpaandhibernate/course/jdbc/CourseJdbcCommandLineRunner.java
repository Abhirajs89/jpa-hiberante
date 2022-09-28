package com.abhiraj.springboot.jpaandhibernate.course.jdbc;

import com.abhiraj.springboot.jpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1,"Learn Spring JDBC","Abhiraj"));
        repository.insert(new Course(2,"Learn AWS","Anuja"));
        repository.insert(new Course(3,"Learn JPA","Vivek"));
        repository.insert(new Course(4,"Learn Java","Sayali"));

        repository.delete(4);
    }
}
