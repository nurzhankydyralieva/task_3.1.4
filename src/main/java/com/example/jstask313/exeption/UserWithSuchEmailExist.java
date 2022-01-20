package com.example.jstask313.exeption;

import org.springframework.dao.DataIntegrityViolationException;

public class UserWithSuchEmailExist extends DataIntegrityViolationException {
    public UserWithSuchEmailExist(String msg) {
        super(msg);
    }
}
