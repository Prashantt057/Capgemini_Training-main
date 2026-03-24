package com.example.stockmanagement.exception;

import com.example.stockmanagement.dto.ResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ResponseDto> handle(RuntimeException ex) {

        ResponseDto response = new ResponseDto(400, ex.getMessage(), null);
        return ResponseEntity.badRequest().body(response);
    }
}