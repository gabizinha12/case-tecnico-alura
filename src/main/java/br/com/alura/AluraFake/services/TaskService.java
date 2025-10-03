package br.com.alura.AluraFake.services;

import br.com.alura.AluraFake.dtos.NewOpenTextTaskDTO;
import br.com.alura.AluraFake.repositories.OpenTextTaskRepository;
import br.com.alura.AluraFake.task.OpenTextTask;
import br.com.alura.AluraFake.task.Type;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service("taskService")
public class TaskService {


    @Autowired
    private OpenTextTaskRepository openTextTaskRepository;

    public OpenTextTask createOpenTextTask(NewOpenTextTaskDTO openTextTaskDTO) {
        OpenTextTask openTextTask = new OpenTextTask(openTextTaskDTO.getId(), openTextTaskDTO.getCourseId(), openTextTaskDTO.getStatement(), Type.OPEN_TEXT,openTextTaskDTO.getOrder());
        return openTextTaskRepository.save(openTextTask);
        
        
    }
}
