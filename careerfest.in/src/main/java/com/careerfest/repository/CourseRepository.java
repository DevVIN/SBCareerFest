package com.careerfest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.careerfest.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
