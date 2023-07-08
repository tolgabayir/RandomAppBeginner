package com.tolcode.RandomApp.repository;

import com.tolcode.RandomApp.model.entity.Todo;
import com.tolcode.RandomApp.model.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo,Long> {
    List<Todo> findAllByUser(Users user);

}
