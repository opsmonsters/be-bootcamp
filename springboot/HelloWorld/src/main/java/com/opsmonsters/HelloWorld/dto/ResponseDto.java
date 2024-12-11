package com.opsmonsters.HelloWorld.dto;

public class ResponseDto {
    public int statusCode;
    public Object response;

    public ResponseDto(int statusCode, Object response){
        this.statusCode = statusCode;
        this.response = response;
    }
}
