package com.example.service;

import com.example.dao.entities.User;
import com.example.service.dtos.UserDTO;

import java.util.Date;


public interface UserManager {


    public User getUserByEmail(String email);

    public User getUserByDateNaissance(Date date);

    public  UserDTO saveUser(Date date);

    public User deleteUser(Date date);

}



