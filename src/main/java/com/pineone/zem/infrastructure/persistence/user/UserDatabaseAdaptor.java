package com.pineone.zem.infrastructure.persistence.user;

import com.pineone.zem.domain.user.UserRepository;
import com.pineone.zem.domain.user.aggregate.User;
import com.pineone.zem.infrastructure.persistence.user.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UserDatabaseAdaptor implements UserRepository {
    private final JpaUserRepository jpaUserRepository;

    @Override
    public Optional<User> findByUserId(Long userId) {
        return jpaUserRepository.findByUserId(userId)
                                .map(UserMapper::toUser);
    }
}
