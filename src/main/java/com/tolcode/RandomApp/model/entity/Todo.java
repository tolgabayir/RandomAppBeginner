package com.tolcode.RandomApp.model.entity;

import lombok.Data;
import org.apache.catalina.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Todo extends BaseEntity{
    @Column
    private String text;
    private boolean completed;

    @ManyToOne
    private Users user;
}
