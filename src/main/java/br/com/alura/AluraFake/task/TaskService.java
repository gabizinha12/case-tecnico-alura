package br.com.alura.AluraFake.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alura.AluraFake.user.UserRepository;

@Service
public class TaskService {


    @Autowired
    private TaskRepository taskRepository;


    private static final Type OPEN_TEXT = Type.OPEN_TEXT;

    public void createNewOpenTextTask(Task task) {
        if(task.getType().equals(OPEN_TEXT)) {
            taskRepository.save(task);
        }
    }

}



