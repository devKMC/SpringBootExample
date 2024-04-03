package com.example.board.service.implementations;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.board.dto.request.auth.SignUpRequestDto;
import com.example.board.dto.response.ResponseDto;
import com.example.board.service.AuthService;

@Service
public class AuthServiceImplementation implements AuthService{
            //@ 클래스에 빨간줄이 떠서 자동 생성 기능 사용

    @Override
    public ResponseEntity<ResponseDto> signUp(SignUpRequestDto dto) {

    }
    
}
