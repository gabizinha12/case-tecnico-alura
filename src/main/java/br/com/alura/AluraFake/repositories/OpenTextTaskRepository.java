package br.com.alura.AluraFake.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.AluraFake.task.OpenTextTask;

@Repository
public interface OpenTextTaskRepository extends JpaRepository<OpenTextTask, Long>{

}
