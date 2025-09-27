package br.com.alura.AluraFake.task;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.IdGeneratorType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;

@Entity
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
    private LinkedHashSet<Options> options;
    @Enumerated(EnumType.STRING)
    private Type type;

}
