package br.com.alura.AluraFake.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.alura.AluraFake.dtos.NewOpenTextTaskDTO;
import br.com.alura.AluraFake.task.OpenTextTask;
import jakarta.validation.Valid;

@RestController
public class TaskController {

    @PostMapping("/task/new/opentext")
    public ResponseEntity newOpenTextExercise(@Valid @RequestBody NewOpenTextTaskDTO newOpenTextTaskDTO) {
        OpenTextTask openTextTask = new OpenTextTask(newOpenTextTaskDTO.type, newOpenTextTaskDTO.getStatement());
        
        return ResponseEntity.ok().build();
    }

    @PostMapping("/task/new/singlechoice")
    public ResponseEntity newSingleChoice() {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/task/new/multiplechoice")
    public ResponseEntity newMultipleChoice() {
        return ResponseEntity.ok().build();
    }

}