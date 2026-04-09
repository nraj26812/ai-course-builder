package com.naveen.aicoursebuilder.repository;

import com.naveen.aicoursebuilder.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}