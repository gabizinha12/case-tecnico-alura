package br.com.alura.AluraFake.dtos;

import java.time.LocalDateTime;

import br.com.alura.AluraFake.course.Course;
import br.com.alura.AluraFake.course.Status;
import br.com.alura.AluraFake.user.User;
import jakarta.persistence.ManyToOne;

public class CourseListInstructorDTO {

    private Long courseId;
    private String title;
    private String description;
    private Status status;
    private LocalDateTime publishedAt;
    @ManyToOne
    private User instructor;

    public CourseListInstructorDTO() {
    }

    public CourseListInstructorDTO(Course course) {
        this.courseId = course.getCourseId();
        this.title = course.getTitle();
        this.description = course.getDescription();
        this.status = course.getStatus();
        this.publishedAt = course.getPublishedAt();
        this.instructor = course.getInstructor();
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDateTime getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(LocalDateTime publishedAt) {
        this.publishedAt = publishedAt;
    }

    public User getInstructor() {
        return instructor;
    }

    public void setInstructor(User instructor) {
        this.instructor = instructor;
    }

}
