package br.com.alura.AluraFake.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alura.AluraFake.exceptions.UserArleadyExistsException;

@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;



    public void createUser(User user) throws UserArleadyExistsException {
        if(userRepository.existsByEmail(user.getEmail())) {
            throw new UserArleadyExistsException("User with email   "  + user.getEmail() +  " arleady exists");
        } else {
            userRepository.save(user);
        }
    }
}
