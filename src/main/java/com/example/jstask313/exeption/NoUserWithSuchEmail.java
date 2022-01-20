package com.example.jstask313.exeption;

import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class NoUserWithSuchEmail extends UsernameNotFoundException {

    public NoUserWithSuchEmail(String msg) {
        super(msg);
    }
}
