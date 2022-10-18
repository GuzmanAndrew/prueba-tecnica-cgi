package com.cgi.prueba.services.impl;

import com.cgi.prueba.entities.User;
import com.cgi.prueba.repositories.IUserRepository;
import com.cgi.prueba.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public List<User> findUsers() {
        return userRepository.findAll();
    }
}
