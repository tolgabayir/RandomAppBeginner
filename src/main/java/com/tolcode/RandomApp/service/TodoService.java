package com.tolcode.RandomApp.service;

import com.tolcode.RandomApp.model.entity.Todo;
import com.tolcode.RandomApp.model.entity.Users;
import com.tolcode.RandomApp.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Autowired
    private UsersService usersService;


    public List<Todo> getTodoListByUserId(long userId){
            Users user = usersService.getUserById(userId);
            List<Todo> todos=todoRepository.findAllByUser(user);
            return todos;


    }

}
