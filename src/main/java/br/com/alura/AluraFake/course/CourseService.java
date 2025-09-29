package br.com.alura.AluraFake.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import br.com.alura.AluraFake.task.TaskRepository;

@Service
@Primary
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    // private static final Status PUBLISHED = Status.PUBLISHED;

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
}
