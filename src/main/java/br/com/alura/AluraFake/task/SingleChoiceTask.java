package br.com.alura.AluraFake.task;

import java.util.List;

public class SingleChoiceTask {

    private Long id;
    private String statement;
    private List<String> options;
    private Integer order;
    private Integer courseId;

    public SingleChoiceTask() {
    }

    
    public SingleChoiceTask(Long id, String statement, List<String> options, Integer order, Integer courseId) {
        this.id = id;
        this.statement = statement;
        this.options = options;
        this.order = order;
        this.courseId = courseId;
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
    public List<String> getOptions() {
        return options;
    }
    public void setOptions(List<String> options) {
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
