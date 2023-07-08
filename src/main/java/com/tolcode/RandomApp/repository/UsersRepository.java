package com.tolcode.RandomApp.repository;

import com.tolcode.RandomApp.model.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long>{

    Users findByUsername(String username);
}
