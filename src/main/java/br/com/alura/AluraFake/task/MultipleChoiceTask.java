package br.com.alura.AluraFake.task;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class MultipleChoiceTask {

    @Id
    private Long id;
    private String statement;
    @ElementCollection
    @JsonProperty("options")
    private List<Options> options;
    private Integer order;
    private Integer courseId;
    private Type type = Type.MULTIPLE_CHOICE;

    public MultipleChoiceTask() {
    }

    public MultipleChoiceTask(Long id, String statement, List<Options> options, Integer order, Integer courseId,
            Type type) {
        this.id = id;
        this.statement = statement;
        this.options = options;
        this.order = order;
        this.courseId = courseId;
        this.type = Type.MULTIPLE_CHOICE;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public List<Options> getOptions() {
        return options;
    }

    public void setOptions(List<Options> options) {
        this.options = options;
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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

}
