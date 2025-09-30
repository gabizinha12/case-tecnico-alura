package br.com.alura.AluraFake.course;

<<<<<<< HEAD
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
=======
>>>>>>> parent of e87af34 (feat:Create services and inject repositories)
import org.springframework.stereotype.Service;

@Service
@Primary
public class CourseService {

<<<<<<< HEAD
    @Autowired
    private CourseRepository courseRepository;

    // private static final Status PUBLISHED = Status.PUBLISHED;

<<<<<<< HEAD
    // private static final Status BUILDING = Status.BUILDING;

    public void createCourse(Course course) {
        courseRepository.save(course);

    }

    public List<CourseListItemDTO> findAllCourses() {
        List<CourseListItemDTO> courses = courseRepository.findAll().stream()
                .map(CourseListItemDTO::new)
                .toList();
        return courses;
    }
=======

    
>>>>>>> parent of 1c0b236 (feat: Start writing logic for course publishing, tasks and users)
=======
>>>>>>> parent of e87af34 (feat:Create services and inject repositories)
}
