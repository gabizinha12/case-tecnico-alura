package br.com.alura.AluraFake.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.AluraFake.task.MultipleChoiceTask;

@Repository
public interface MultipleChoiceTaskRepository extends JpaRepository<MultipleChoiceTask, Long>{

}
