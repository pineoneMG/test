package com.pineone.zem.domain.user;

import com.pineone.zem.domain.user.aggregate.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findByUserId(Long userId);
}
