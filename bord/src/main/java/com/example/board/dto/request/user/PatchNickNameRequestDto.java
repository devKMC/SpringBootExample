package com.example.board.dto.request.user;


import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class PatchNickNameRequestDto {
    @NotBlank
    private String email;
    @NotBlank
    private String nickName;
}
