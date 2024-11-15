package com.pineone.zem.domain.user.aggregate;

import lombok.Getter;

@Getter
public class User {
    private Long id;
    private Long userId;
    private String username;
    private String password;
    private String email;

    private User(Long id, Long userId, String username, String password, String email) {}

    public static User from(Long id, Long userId, String username, String password, String email) {
        return new User(id, userId, username, password, email);
    }

}
