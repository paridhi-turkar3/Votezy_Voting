package com.votezy.votezy_backend.controller;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Map<String,String>>
    handleRuntimeException(RuntimeException ex){

        Map<String,String> error =
                new HashMap<>();

        error.put("messageString",
                ex.getMessage());

        return ResponseEntity
                .badRequest()
                .body(error);
    }
}