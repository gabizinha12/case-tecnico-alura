package br.com.alura.AluraFake.services;

import java.util.List;
import java.util.Optional;

import br.com.alura.AluraFake.user.User;
import jakarta.persistence.EntityNotFoundException;
import br.com.alura.AluraFake.dtos.NewCourseDTO;
import br.com.alura.AluraFake.dtos.NewUserDTO;
import br.com.alura.AluraFake.repositories.UserRepository;

import org.hibernate.validator.internal.util.privilegedactions.NewSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void createUser(User user) throws Exception {
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new Exception("User with email   " + user.getEmail() + " arleady exists");
        } else  if(user.getEmail().isEmpty() && user.getEmail().isBlank()){
          throw new Exception("Email inválido");
        }
        userRepository.save(user);
    }

    
    public void createInstructor(User user) throws Exception {
          if (userRepository.existsByEmail(user.getEmail())) {
            throw new Exception("User with email   " + user.getEmail() + " arleady exists");
        } else  if(user.getEmail().isEmpty() && user.getEmail().isBlank()){
          throw new Exception("Email inválido");
        }
        userRepository.save(user);
    }


    public Optional<User> findByEmailPossibleInstructor(NewCourseDTO newCourse) {
        Optional<User> possibleAuthor = userRepository
                .findByEmail(newCourse.getEmailInstructor())
                .filter(User::isInstructor);
        return possibleAuthor;
    }

    public boolean findByEmailUser(String email) {
        boolean userExists;
        if (email != null && !email.isBlank()) {
            userExists = userRepository.existsByEmail(email);
        } else {
            throw new IllegalArgumentException("Email is null");
        }
        return userExists;

    }

    public List<User> findAll() {
        List<User> user = userRepository.findAll();
        return user;
    }

    public Optional<User> findById(Long id) {
        Optional<User> user = userRepository.findById(id);
        // pesquisa por usuario, caso não exista retorna um Optional vazio
        return user.isPresent() ? user : Optional.empty();

    }
}
