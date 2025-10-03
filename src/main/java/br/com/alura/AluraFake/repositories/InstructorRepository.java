package br.com.alura.AluraFake.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.AluraFake.user.User;

public interface InstructorRepository extends JpaRepository<User, Long>{

}
