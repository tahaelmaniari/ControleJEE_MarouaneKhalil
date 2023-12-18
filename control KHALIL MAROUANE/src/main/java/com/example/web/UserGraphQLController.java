package com.example.web;

import com.example.dao.entities.User;
import com.example.service.UserManager;
import com.example.service.dtos.UserDTO;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.List;

@Controller
@AllArgsConstructor
public class UserGraphQLController {
    private UserManager userManager;

    @QueryMapping
    public User userList(String email) {
        return userManager.getUserByEmail(email);
    }

    @QueryMapping
    public User getUserByDateNaissance(@Argument Date date) {
        return userManager.getUserByDateNaissance(date);
    }

    @MutationMapping
    public User saveUser(@Argument User user) {
        return userManager.saveUser(user);
    }

    @MutationMapping
    public User saveUser(@Argument UserDTO CreatorRequest) {
        return UserManager.saveUser(CreatorRequest);
    }
}
