package com.example.affabblebeanui.exception;

import org.springframework.web.server.ResponseStatusException;

public class AuthenticationException extends RuntimeException {
    public AuthenticationException(String message){
        super(message);
    }
}
