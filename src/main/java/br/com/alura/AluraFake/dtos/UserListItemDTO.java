package br.com.alura.AluraFake.dtos;

import java.io.Serializable;

import br.com.alura.AluraFake.user.Role;
import br.com.alura.AluraFake.user.User;

public class UserListItemDTO implements Serializable {

    private String name;
    private String email;
    private Role role;

    public UserListItemDTO(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.role = user.getRole();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Role getRole() {
        return role;
    }

}
