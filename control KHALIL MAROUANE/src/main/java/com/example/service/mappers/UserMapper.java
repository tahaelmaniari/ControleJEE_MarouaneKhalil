package com.example.service.mappers;

import com.example.dao.entities.User;
import com.example.service.dtos.UserDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    private ModelMapper modelMapper = new ModelMapper();

    public User fromUserDTOToUser (UserDTO userDTO) {

        return modelMapper.map(userDTO, User.class);
    }
    public UserDTO fromUserToUserDTO (User user) {

        return modelMapper.map(user, UserDTO.class);
    }
}
