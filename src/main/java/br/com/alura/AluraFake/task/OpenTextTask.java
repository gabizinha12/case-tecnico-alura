package br.com.alura.AluraFake.task;

import br.com.alura.AluraFake.course.Course;
import br.com.alura.AluraFake.dtos.NewOpenTextTaskDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "open_text_task")
public class OpenTextTask {

    @Id
    @ManyToOne
    @JoinColumn(name = "course_id", referencedColumnName = "id")
    private Course course;
    private String description;
    private Type type = Type.OPEN_TEXT;

    @Deprecated
    public OpenTextTask() {
    }

    public OpenTextTask(Type type, String description) {
        this.type = Type.OPEN_TEXT;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public NewOpenTextTaskDTO toDTO() {
        return new NewOpenTextTaskDTO(Type.OPEN_TEXT, description);
    }

}
