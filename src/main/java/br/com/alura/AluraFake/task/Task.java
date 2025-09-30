package br.com.alura.AluraFake.task;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.IdGeneratorType;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    private LinkedHashSet<Options> options = new LinkedHashSet<>();
    @Enumerated(EnumType.STRING)
    private Type type;
<<<<<<< HEAD

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
=======
>>>>>>> parent of 1c0b236 (feat: Start writing logic for course publishing, tasks and users)

}
