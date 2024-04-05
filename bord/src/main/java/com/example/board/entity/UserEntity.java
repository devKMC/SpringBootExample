package com.example.board.entity;

import com.example.board.dto.request.auth.SignUpRequestDto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="user")
@Table(name="user")
public class UserEntity {
    @Id
    private String email;
    private String password;
    private String nickname;
    private String telNumber;
    private String address;
    private String addressDetail;
    private String profileImageUrl;


    // * 여기까지 작성후  DTO 클래스를 작업 (엔티티 클래스와 클라이언트간의 데이터 전달)
    // * Dto 작업이 끝난후 넘어와서 사용 해줌

    // * 생성자로 SignUpRequestDto 객체를 이용하여 UserEntity 객체를 생성하는 것 이러한 생성자는  DTO(Data Transfer Object) 객체를 엔티티(Entity) 객체로 변환하기 위해 사용
    // 클라이언트에서 전달된 데이터를 데이터베이스에 저장하기 위해 엔티티 객체로 변환
    public UserEntity (SignUpRequestDto dto) {
        this.email = dto.getEmail();
        this.password = dto.getPassword();
        this.nickname = dto.getNickname();
        this.telNumber = dto.getTelNumber();
        this.address = dto.getAddress();
        this.addressDetail = dto.getAddressDetail();
    }
}
