package br.com.alura.AluraFake.services;

import br.com.alura.AluraFake.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("taskService")
public class TaskService {


    @Autowired
    private TaskRepository taskRepository;
}
