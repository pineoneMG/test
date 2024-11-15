package com.pineone.zem.domain.user.aggregate;

import lombok.Getter;

@Getter
public class User {
    private Long id;
    private Long userId;
    private String username;
    private String password;
    private String email;

    public User(Long id, Long userId, String username, String password, String email) {}
}
