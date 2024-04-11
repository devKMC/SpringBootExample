package com.example.board.service;

import org.springframework.http.ResponseEntity;

import com.example.board.dto.request.auth.SignUpRequestDto;
import com.example.board.dto.response.ResponseDto;


// 이 메서드는 SignUpRequestDto라는 형식의 매개변수를 받아들이고, ResponseEntity 객체 안에 담긴 ResponseDto 객체를 반환
// signUp 메서드는 클라이언트의 회원가입 요청을 처리하고, 해당 요청에 대한 적절한 응답을 포함하는 ResponseEntity 객체를 반환
//  이 때, 응답 본문에는 ResponseDto 객체가 포함

// * 여기를 작성한후 컨트롤러로 가서 signup 을 작성

public interface AuthService {

    //반환 타입이 코드와 메세지로만 이루어져있는 타입
    ResponseEntity<ResponseDto> signUp(SignUpRequestDto dto);
} 