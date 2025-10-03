package br.com.alura.AluraFake.task;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "open_text_task")
public class OpenTextTask {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer courseId;
    @Column(name = "description", length = 255)
    private String description;
    @Enumerated(EnumType.STRING)
    private Type type;
    @Column(name="task_order")
    private Integer taskOrder;

    @JsonCreator
    public OpenTextTask() {}


    public String getDescription() {
        return description;
    }

    @JsonCreator
    public OpenTextTask(Long id,@JsonProperty Integer courseId,@JsonProperty String description, @JsonProperty Type type,@JsonProperty Integer taskOrder) {
        this.id = id;
        this.courseId = courseId;
        this.description = description;
        this.type = type;
        this.taskOrder = taskOrder;
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


    public Integer getOrder() {
        return taskOrder;
    }

    public void setOrder(Integer order) {
        this.taskOrder = order;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    


    public Integer getTaskOrder() {
        return taskOrder;
    }


    public void setTaskOrder(Integer taskOrder) {
        this.taskOrder = taskOrder;
    }


    public Integer getCourseId() {
        return courseId;
    }


    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }



  
}
