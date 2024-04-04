package com.example.board.service.implementations;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.board.dto.request.auth.SignUpRequestDto;
import com.example.board.dto.response.ResponseDto;
import com.example.board.entity.UserEntity;
import com.example.board.repository.UserRepository;
import com.example.board.service.AuthService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthServiceImplementation implements AuthService {

    // 의존성 주입으로 넘겨주기 위해 RequiredArgsConstructor
    private final UserRepository userRepository;

    // @ 클래스에 빨간줄이 떠서 자동 생성 기능 사용
    @Override
    public ResponseEntity<ResponseDto> signUp(SignUpRequestDto dto) {
        try {

            // 1. 입력 받은 이메일이 유저 테이블에 존재하는지 조회 (true, false)
            // email - > (true , false)
            String email = dto.getEmail();
            boolean isExistEmail = userRepository.existsByEmail(email);

            // 1-1. 1에 대한 조회결과가 true 일때 중복된 이메일 응답 처리
            if (isExistEmail) return ResponseDto.duplicateEmail();

            // 2. 입력 받은 닉네임이 유저 테이블에 존재하는지 조회 (true, false)
            // nickName - > (true , false)
            String nickname = dto.getNickname();
            boolean isExistNickname = userRepository.existsByNickname(nickname);

            // 2-1. 2에 대한 조회결과가 true 일때 중복된 닉네임 응답 처리
            if (isExistNickname) return ResponseDto.duplicateNickname();
            

            // 3. 입력 받은 휴대전화번호가 유저 테이블에 존재하는지 조회 (true, false)
            // temNumber - > (true , false)
            String telNumber = dto.getTelNumber();
            boolean isExistTelNumber = userRepository.existsByTelNumber(telNumber);


            // 3-1. 3에 대한 조회결과가 true 일때 중복된 휴대전화번호 응답 처리
            if (isExistTelNumber) return ResponseDto.duplicateTelNumber();

            // 4. 유저 레코드 삽입
            // 4-1 . 유저 엔터티의 인스턴스 생성
            // (dto) -> userEntity 인스턴스
            UserEntity userEntity = new UserEntity(dto);

            // 4-2 . 유저 엔터티 인스턴스 저장
            userRepository.save(userEntity);

            // 5. 성공 응답 처리
            return ResponseDto.success();

        } catch (Exception exception) {
            // 데이터베이스 작업중에 발생하는 예외가 있으면 에러 처리를 하는 곳
            return ResponseDto.databaseError();
        }
    }

}
