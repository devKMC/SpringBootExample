package com.example.board.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.board.dto.request.auth.SignUpRequestDto;
import com.example.board.dto.response.ResponseDto;
import com.example.board.service.AuthService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor // * 의존성 주입 어노테이션
public class AuthController {

    private final AuthService authService;
    
    @PostMapping("/sign-up")
    public ResponseEntity<ResponseDto> signUp(

    // 요청 본문으로부터 데이터를 SignUpRequestDto 객체로 매핑하고 유효성을 검사합니다.
        @RequestBody @Valid SignUpRequestDto requestBody
    ) {
    
        // authService의 signUp 메서드를 호출하여 회원가입을 처리하고,
        // 그 결과를 ResponseEntity<ResponseDto> 형태로 받습니다.
        ResponseEntity<ResponseDto> response = authService.signUp(requestBody);

        // 회원가입 처리 결과를 클라이언트에게 반환합니다.
        return response;
    }
}

