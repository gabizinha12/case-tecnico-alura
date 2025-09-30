package br.com.alura.AluraFake.repositories;

import br.com.alura.AluraFake.task.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface TaskRepository extends JpaRepository<Task, Long>{

}
