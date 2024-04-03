package com.example.board.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


// @Configuration 어노테이션을 붙여서 설정 파일 이라는 것을 표시
@Configuration
// 인터페이스 WebMvcConfigurer를 구현하고 addCorsMappings() 메소드를 오버라이딩 합니다.
public class CorsConfig implements WebMvcConfigurer {
    
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry

        // * 와일드 카드로 ( * ) 을 사용
            .addMapping("/**")
            .allowedMethods("*")
            .allowedOrigins("*");
    }

}
