package com.pineone.zem.domain.user.service;

import com.pineone.zem.domain.user.UserRepository;
import com.pineone.zem.global.exception.UserNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDomainService {

    private final UserRepository userRepository;

    public void validateUser(Long userId) {
        userRepository.findByUserId(userId)
                      .orElseThrow(()-> new UserNotFoundException("UserId : "+ userId + " not found"));
    }

}
