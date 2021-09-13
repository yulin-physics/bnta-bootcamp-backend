package io.bootcamp.BootcampBackend.course;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    private final CourseDAO courseDAO;

    public CourseService(CourseDataAccessService courseDataAccessService) {
        this.courseDAO = courseDataAccessService;
    }

    public void addNewCourse(Course course){
        // TODO: check if user exists
        int result = courseDAO.insertCourse(course);
        if (result != 1) {
            throw new IllegalStateException("oops something went wrong");
        }
    }

    public List<Course> selectAllCourses() {
        return courseDAO.selectAllCourses();
    }
}