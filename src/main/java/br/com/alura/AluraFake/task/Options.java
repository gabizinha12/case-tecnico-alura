package br.com.alura.AluraFake.task;

import jakarta.persistence.*;

@Entity
@Table(name = "options")
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
    public Options() {}

    public Options(Long id, String name, boolean isCorrect, Task task) {
        this.id = id;
        this.name = name;
        this.isCorrect = isCorrect;
        this.task = task;
    }


    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public boolean isCorrect() {
        return isCorrect;
    }



    public void setCorrect(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }

    
    
}
