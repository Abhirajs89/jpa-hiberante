package com.abhiraj.springboot.jpaandhibernate.course.jpa;

import com.abhiraj.springboot.jpaandhibernate.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course){
        entityManager.merge(course);
    }

    public void delete(long id){
        Course course = entityManager.find(Course.class,id);
        entityManager.remove(course);
    }

    public Course findById(long id){
        return entityManager.find(Course.class,id);

    }
}
