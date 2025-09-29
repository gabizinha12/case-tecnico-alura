package br.com.alura.AluraFake.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import br.com.alura.AluraFake.course.NewCourseDTO;
import br.com.alura.AluraFake.exceptions.UserArleadyExistsException;

@Service
@Primary
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void createUser(User user) throws UserArleadyExistsException {
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new UserArleadyExistsException("User with email   " + user.getEmail() + " arleady exists");
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
}
