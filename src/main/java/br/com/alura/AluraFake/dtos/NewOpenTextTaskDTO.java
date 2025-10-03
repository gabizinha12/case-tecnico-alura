package br.com.alura.AluraFake.dtos;

import org.hibernate.validator.constraints.Length;

import br.com.alura.AluraFake.course.Course;
import br.com.alura.AluraFake.task.OpenTextTask;
import br.com.alura.AluraFake.task.Type;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotNull;

public class NewOpenTextTaskDTO {

    
    private Long id;
    @Enumerated
    public Type type;
    @NotNull
    @Length(min = 4, max = 255)
    public String statement;
    private Integer order;
    private Integer courseId;

    public NewOpenTextTaskDTO() {
    }



    public NewOpenTextTaskDTO(Long id, Type type, @NotNull @Length(min = 4, max = 255) String statement, Integer order,
            Integer courseId) {
        this.id = id;
        this.type = type;
        this.statement = statement;
        this.order = order;
        this.courseId = courseId;
    }



    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

   


    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
    }





    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }



    public Integer getCourseId() {
        return courseId;
    }



    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }



   
  

}