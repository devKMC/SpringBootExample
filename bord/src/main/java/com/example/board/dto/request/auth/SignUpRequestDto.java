package com.example.board.dto.request.auth;


import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


// * 엔티티에서 넘어와서 데이터 전달 하기 위해 SignUpRequest Dto를 작성

// 만약 getter를 생성하지 않으면 생성자를 만들어서 따로 호출해야 함
// SignUpRequestDto dto = new SignUpRequestDto();
// String email = dto.getEmail(); // 직접 getter 메서드 호출

@Getter 
@Setter
@NoArgsConstructor // 생성자를 자동으로 생성해주는 어노테이션
public class SignUpRequestDto {

        //API 명세서를 보고 작업 (SignUp Request)

        @NotBlank // NULL 이면안됨 , 빈문자열 안됨
        @Pattern(regexp = "^[a-zA-Z0-9]*@([-,]?[a-zA-Z0-9])*\\.[a-zA-Z]{2,4}$") // 패턴으로 들어오는 값 범위 지정하기
        private String email;

        @NotBlank
        @Length(min=8, max = 20) // 8자에서 20자 제한
        private String password;

        @NotBlank
        private String nickname;

        @NotBlank
        @Pattern(regexp = "^[0-9]{10,12}$") // 정규식의 시작과 끝 ^$  , 0 ~ 9까지 이루어진 숫자, 길이는 {} 로 10,12 자 사이의 숫자로만 이루어진 문자만 올 수 있음
        private String telNumber;

        @NotBlank
        private String address;

        private String addressDetail;
}

// * 그런다음 엔티티에서 생성자를 만들어서 호출함