package com.tolcode.RandomApp.service;

import com.tolcode.RandomApp.model.dto.RegisterDTO;
import com.tolcode.RandomApp.model.entity.Users;
import com.tolcode.RandomApp.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public RegisterDTO save(RegisterDTO dto){
        Users user = new Users();
        user.setUsername(dto.getUsername());
        String hashPassword=passwordEncoder.encode(dto.getPassword());
        user.setPassword(hashPassword);
        usersRepository.save(user);
        return dto;
    }

    public Users getUserById(long userId) {
        return usersRepository.findById(userId).orElse(null);
    }
}
