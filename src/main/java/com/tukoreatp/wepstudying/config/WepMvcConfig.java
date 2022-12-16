package com.tukoreatp.wepstudying.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WepMvcConfig implements WebMvcConfigurer {

    private final long MAX_AGE_SECS = 3600;

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //모든 경로에 대해
        registry.addMapping("/**")
                //Origin이 http:localhost:3000에 대해
                .allowedOrigins("http://localhost:3000")
                // GET, POST, PUT, PATCH, DELETE, OPTIONS메소드를 허용한다.
                .allowedMethods("GET", "PUT", "PATCH", "DELETE", "OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(true) // 인증
                .maxAge(MAX_AGE_SECS);
    }
}
