package br.com.alura.AluraFake.task;

import java.util.List;

public class MultipleChoiceTask {

    private Long id;
    private String statement;
    private List<Options> options;
    private Integer order;
    private Integer courseId;
    
    
    public MultipleChoiceTask() {
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


    
    

}
