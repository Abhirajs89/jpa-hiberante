package com.abhiraj.springboot.jpaandhibernate.course;

import com.abhiraj.springboot.jpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.abhiraj.springboot.jpaandhibernate.course.jpa.CourseJpaRepository;
import com.abhiraj.springboot.jpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    //@Autowired
   // private CourseJdbcRepository repository;

    //@Autowired
    //private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;


    @Override
    public void run(String... args) throws Exception {
       /* repository.insert(new Course(1,"Learn Spring JDBC","Abhiraj"));
        repository.insert(new Course(2,"Learn AWS JPA","Anuja"));
        repository.insert(new Course(3,"Learn JPA Test","Vivek"));
        repository.insert(new Course(4,"Learn Java","Sayali"));

        repository.delete(4);

        System.out.println(repository.findById(2));
        System.out.println(repository.findById(3));*/

        repository.save(new Course(1,"Learn Spring JDBC","Abhiraj"));
        repository.save(new Course(2,"Learn AWS Spring Data JPA","Anuja"));
        repository.save(new Course(3,"Learn Spring Data JPA","Vivek"));
        repository.save(new Course(4,"Learn Java","Sayali"));

        repository.deleteById(4l);

        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));

        System.out.println(repository.findAll());
        System.out.println(repository.count());

        System.out.println(repository.findByAuthor("Abhiraj"));
        System.out.println(repository.findByName("Learn Spring Data JPA"));
    }
}
