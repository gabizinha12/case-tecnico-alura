package br.com.alura.AluraFake.task;

import jakarta.persistence.Column;
<<<<<<< HEAD
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
=======
>>>>>>> parent of e87af34 (feat:Create services and inject repositories)

@Entity
public class Options {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(unique = true)
    private String name;
    boolean isCorrect;
    private Task task;
}
