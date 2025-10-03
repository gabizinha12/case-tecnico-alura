package br.com.alura.AluraFake.controllers;

import br.com.alura.AluraFake.dtos.NewUserDTO;
import br.com.alura.AluraFake.dtos.UserListItemDTO;
import br.com.alura.AluraFake.repositories.UserRepository;
import br.com.alura.AluraFake.services.UserService;
import br.com.alura.AluraFake.user.User;
import br.com.alura.AluraFake.util.ErrorItemDTO;
import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.*;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @Transactional
    @PostMapping("/user/new")
    public ResponseEntity newStudent(@RequestBody @Valid NewUserDTO newUser) throws Exception {
        if (userService.findByEmailUser(newUser.getEmail())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new ErrorItemDTO("email", "Email já cadastrado no sistema"));
        }
            User user = new User(newUser.getName(), newUser.getEmail(), newUser.getRole());
            userService.createUser(user);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @Transactional
    @PostMapping("/instructor/new")
    public ResponseEntity newInstructor(@RequestBody @Valid NewUserDTO newUser) throws Exception {
         if (userService.findByEmailUser(newUser.getEmail())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new ErrorItemDTO("email", "Email já cadastrado no sistema"));
        }
            User user = new User(newUser.getName(), newUser.getEmail(), newUser.getRole());
            userService.createInstructor(user);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/user/all")
    public List<UserListItemDTO> listAllUsers() {
        return userService.findAll().stream().map(UserListItemDTO::new).toList();
    }

}
