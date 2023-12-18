package com.example.service;

import com.example.dao.entities.User;
import com.example.dao.repositories.UserRepository;
import com.example.service.dtos.UserDTO;
import com.example.service.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserManagerAction {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper userMapper;

    private UserManager userManager;


    public User getUserByEmail(String email) {

        return userRepository.findById(email);
    }

    public User saveUser(UserDTO userDTO) {
        User user = userMapper.fromUserDTOToUser(userDTO);
        return userRepository.save(user);
    }

    public UserDTO getUser(Long id) {
        User user = userRepository.findById(id).get();
        return this.userMapper.fromUserToUserDTO(user);
    }
    public UserDTO deleteUser(Long id) {
        return userRepository.findById(id);
    }
}
