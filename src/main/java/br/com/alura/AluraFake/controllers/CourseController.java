package br.com.alura.AluraFake.controllers;

import br.com.alura.AluraFake.course.Course;
import br.com.alura.AluraFake.course.Status;
import br.com.alura.AluraFake.dtos.NewCourseDTO;
import br.com.alura.AluraFake.repositories.*;
import br.com.alura.AluraFake.services.CourseService;
import br.com.alura.AluraFake.services.UserService;
import br.com.alura.AluraFake.user.User;
import br.com.alura.AluraFake.util.ErrorItemDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.*;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class CourseController {

    @Autowired
    @Qualifier("courseService")
    private CourseService courseService;
    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @Transactional
    @PostMapping("/course/new")
    public ResponseEntity createCourse(@Valid @RequestBody NewCourseDTO newCourse) {

        // Caso implemente o bonus, pegue o instrutor logado
        Optional<User> possibleAuthor = userService.findByEmailPossibleInstructor(newCourse);

        if (possibleAuthor.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new ErrorItemDTO("emailInstructor", "Usuário não é um instrutor"));
        } else  {
            Course course = new Course(newCourse.getId(), newCourse.getTitle(), newCourse.getDescription(), possibleAuthor.get(), Status.BUILDING);
            courseService.createCourse(course);

        }
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/course/all")
    public ResponseEntity<List<Course>> findAllCourses() {
        List<Course> courses = courseService.findAllCourses();
        return ResponseEntity.ok(courses);
    }

    @PostMapping("/course/{id}/publish")
    public ResponseEntity<Course> publishCourse(@PathVariable("id") Long id) {
        return ResponseEntity.ok().build();
    }

}
