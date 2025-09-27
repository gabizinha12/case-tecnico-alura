package br.com.alura.AluraFake.task;

import jakarta.persistence.Column;

public class Options {


    @Column(unique = true)
    private String name;
    boolean isCorrect;
    private Task task;
}
