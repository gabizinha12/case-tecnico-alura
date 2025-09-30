package br.com.alura.AluraFake.task;

import jakarta.persistence.*;

@Entity
public class Options {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(unique = true)
    private String name;
    boolean isCorrect;
    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;

    @Deprecated
    public Options() {
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    
}
