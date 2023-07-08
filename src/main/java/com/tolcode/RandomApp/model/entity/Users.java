package com.tolcode.RandomApp.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
public class Users extends  BaseEntity{

    @Column
    private String username;
    @Column
    private String password;
}
