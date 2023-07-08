package com.tolcode.RandomApp.controller;

import com.tolcode.RandomApp.model.dto.RegisterDTO;
import com.tolcode.RandomApp.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AuthController {
  @Autowired
  private UsersService usersService;

  @PostMapping("/register")
  public  RegisterDTO register(@RequestBody RegisterDTO dto){
    usersService.save(dto);
    return dto;
  }



}
