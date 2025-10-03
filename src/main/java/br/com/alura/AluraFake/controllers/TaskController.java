package br.com.alura.AluraFake.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.alura.AluraFake.dtos.NewOpenTextTaskDTO;
import br.com.alura.AluraFake.services.TaskService;
import br.com.alura.AluraFake.task.OpenTextTask;
import br.com.alura.AluraFake.task.SingleChoiceTask;
import jakarta.validation.Valid;

@RestController
public class TaskController {

    @Autowired
    @Qualifier("taskService")
    private TaskService taskService;

    @PostMapping("/task/new/opentext")
    public ResponseEntity newOpenTextExercise(@Valid @RequestBody NewOpenTextTaskDTO newOpenTextTaskDTO) {
        OpenTextTask newTask = taskService.createOpenTextTask(newOpenTextTaskDTO);
        return ResponseEntity.ok().body(newTask);
    }

    @PostMapping("/task/new/singlechoice")
    public ResponseEntity newSingleChoice(@Valid @RequestBody SingleChoiceTask singleChoiceTask) {
        // não consegui implementar por erro de deserialização na classe
        singleChoiceTask = taskService.createSingleChoiceTask(singleChoiceTask);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/task/new/multiplechoice")
    public ResponseEntity newMultipleChoice() {
        // criei os modelos mas não consegui avançar mais
        return ResponseEntity.ok().build();
    }

}