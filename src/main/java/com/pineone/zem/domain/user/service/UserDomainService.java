package com.pineone.zem.domain.user.service;

import com.pineone.zem.global.exception.UserNotFoundException;
import com.pineone.zem.infrastructure.persistence.user.UserDatabaseAdaptor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDomainService {
    private final UserDatabaseAdaptor userDatabaseAdaptor;

    public void validateUser(Long userId) {
        userDatabaseAdaptor.findByUserId(userId)
                           .orElseThrow(()-> new UserNotFoundException("UserId : "+ userId + " not found"));
    }

}
