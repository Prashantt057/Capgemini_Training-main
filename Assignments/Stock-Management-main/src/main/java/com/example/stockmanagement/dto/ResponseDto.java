package com.example.stockmanagement.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseDto {

    private int statusCode;
    private String message;
    private Object data;
}
