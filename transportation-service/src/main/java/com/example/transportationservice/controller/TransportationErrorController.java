package com.example.transportationservice.controller;

import org.apache.tomcat.websocket.AuthenticationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class TransportationErrorController {

    @ExceptionHandler({AuthenticationException.class})
    public ResponseEntity handleException(Throwable throwable) throws Throwable{
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                .body("Login Error!");
    }

}
