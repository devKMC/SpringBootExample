package com.example.board.service;
import com.example.board.dto.request.user.PatchNickNameRequestDto;
import com.example.board.dto.response.ResponseDto;
import com.example.board.dto.response.board.user.GetUserResponseDto;

import org.springframework.http.ResponseEntity;

public interface UserService {
    
    ResponseEntity<? super GetUserResponseDto> getUser(String email);

    ResponseEntity<ResponseDto> patchNickname(PatchNickNameRequestDto dto);

}