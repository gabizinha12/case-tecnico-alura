package br.com.alura.AluraFake.task;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SingleChoiceTask {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String statement;
    @ElementCollection
    @JsonProperty("options")
    private List<Options> options = new ArrayList<>();
    private Integer order;
    private Integer courseId;
    private Type type = Type.SINGLE_CHOICE;
    private boolean isCorrect;

    public SingleChoiceTask() {
    }

    public SingleChoiceTask(Long id, String statement, List<Options> options, Integer order, Integer courseId, Type type,
            boolean isCorrect) {
        this.id = id;
        this.statement = statement;
        this.options = options;
        this.order = order;
        this.courseId = courseId;
        this.type = Type.SINGLE_CHOICE;
        this.isCorrect = isCorrect;
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

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }

}
