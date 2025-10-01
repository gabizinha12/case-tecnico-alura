package br.com.alura.AluraFake.task;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Max;

@Entity
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long taskId;
    @Min(4)
    @Max(255)
    @Column(unique = true)
    private String statement;
    private Integer order;
    // hash set para manter a ordem e não permitir duplicatas
    @Size(min = 2, max = 15)
    @Length(min = 4, max = 80)
    @OneToMany(cascade = CascadeType.ALL)
    private LinkedHashSet<Options> options = new LinkedHashSet<>();
    @Enumerated(EnumType.STRING)
    private Type type;

    @Deprecated
    public Task() {
    }

    public Task(Long taskId, @Min(4) @Max(255) String statement, Integer order,
            @Size(min = 2, max = 15) @Length(min = 4, max = 80) LinkedHashSet<Options> options, Type type) {
        this.taskId = taskId;
        this.statement = statement;
        this.order = order;
        this.options = options;
        this.type = type;
    }



    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public LinkedHashSet<Options> getOptions() {
        return options;
    }

    public void setOptions(LinkedHashSet<Options> options) {
        this.options = options;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

}
