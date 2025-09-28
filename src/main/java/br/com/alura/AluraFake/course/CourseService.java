package br.com.alura.AluraFake.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alura.AluraFake.task.TaskRepository;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private TaskRepository taskRepository;

    private static final Status PUBLISHED = Status.PUBLISHED;

    private static final Status BUILDING = Status.BUILDING;

    public void createCourse(Course course) {

        if (course.getStatus() == BUILDING) {
            

        }
    }
}
