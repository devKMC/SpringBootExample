package com.example.board.service;

import org.springframework.http.ResponseEntity;

import com.example.board.dto.request.auth.SignUpRequestDto;
import com.example.board.dto.response.ResponseDto;

public interface AuthService {

    //반환 타입이 코드와 메세지로만 이루어져있는 타입
    ResponseEntity<ResponseDto> signUp(SignUpRequestDto dto);
} 