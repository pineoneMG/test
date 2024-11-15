package com.pineone.zem.global.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/h2-console/**", "/relief/**").permitAll() // /relief 경로 접근 허용
                        .anyRequest().authenticated()
                )
                .csrf().disable()
                .headers().frameOptions().disable();
        return http.build();
    }
}
