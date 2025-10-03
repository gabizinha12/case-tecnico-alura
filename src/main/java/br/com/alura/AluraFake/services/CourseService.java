package br.com.alura.AluraFake.services;

import java.time.LocalDateTime;
import java.util.List;

import br.com.alura.AluraFake.course.Course;
import br.com.alura.AluraFake.course.Status;
import br.com.alura.AluraFake.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;

import org.springframework.stereotype.Service;

@Service("courseService")
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    private static final Status PUBLISHED = Status.PUBLISHED;
    private static final Status BUILDING = Status.BUILDING;

    public void publishCourse(Course course) {
        if(course.getStatus() != BUILDING || !course.getInstructor().isInstructor()) {
            throw new RuntimeException("You cant publish a course if the status isnt building");
        }
        course.setStatus(PUBLISHED);
        course.setPublishedAt(LocalDateTime.now());
        courseRepository.save(course);

    }

       public void createCourse(Course course) {
        courseRepository.save(course);

    }

    public List<Course> findAllCourses() {
        List<Course> courses = courseRepository.findAll().stream()
                .toList();
        return courses;
    }


}
