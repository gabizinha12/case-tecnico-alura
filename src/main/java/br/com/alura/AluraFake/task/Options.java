package br.com.alura.AluraFake.task;

import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;

public class Options {


    @Column(unique = true)
    private String name;
    boolean isCorrect;

    @ManyToOne
    private Task task;
}
