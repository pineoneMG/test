package com.pineone.zem.infrastructure.persistence.user.mapper;

import com.pineone.zem.domain.user.aggregate.User;
import com.pineone.zem.infrastructure.persistence.user.entity.UserEntity;

public class UserMapper {

    public static User toUser(UserEntity userEntity) {
        if (userEntity == null) {
            return null;
        }

        return new User(
                userEntity.getId(),
                userEntity.getUserId(),
                userEntity.getUsername(),
                userEntity.getPassword(),
                userEntity.getEmail()
        );
    }
}
