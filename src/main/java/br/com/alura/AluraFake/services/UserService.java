package br.com.alura.AluraFake.services;

import java.util.List;
import java.util.Optional;

import br.com.alura.AluraFake.user.User;
import br.com.alura.AluraFake.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alura.AluraFake.course.NewCourseDTO;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void createUser(User user)  throws Exception{
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new Exception("User with email   " + user.getEmail() + " arleady exists");
        } else {
            userRepository.save(user);
        }
    }

    public Optional<User> findByEmail(NewCourseDTO newCourse) {
        Optional<User> possibleAuthor = userRepository
                .findByEmail(newCourse.getEmailInstructor())
                .filter(User::isInstructor);
        return possibleAuthor;
    }

    public List<User> findAll() {
        List<User> user = userRepository.findAll();
        return user;
    }
}
