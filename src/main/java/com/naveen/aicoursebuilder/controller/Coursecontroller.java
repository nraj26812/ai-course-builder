package com.naveen.aicoursebuilder.controller;

import com.naveen.aicoursebuilder.entity.Course;
import com.naveen.aicoursebuilder.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private final CourseService service;

    public CourseController(CourseService service) {
        this.service = service;
    }

    @PostMapping
    public Course create(@RequestBody Course course) {
        return service.createCourse(course);
    }

    @GetMapping
    public List<Course> getAll() {
        return service.getAllCourses();
    }
}