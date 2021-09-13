package io.bootcamp.BootcampBackend.course;

import io.bootcamp.BootcampBackend.user.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/courses")

public class CourseController {

    private  CourseService courseService;
    public CourseController(CourseService courseService){
        this.courseService = courseService;
    }

    @PostMapping
    public void addCourse(@RequestBody Course course){
        courseService.addNewCourse(course);
    }

    @GetMapping
    public List<Course> selectAllCourses(){
        return courseService.selectAllCourses();
    }
}