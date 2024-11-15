package com.pineone.zem.domain.relief;

import com.pineone.zem.domain.relief.aggregate.UserAccessBlock;
import com.pineone.zem.infrastructure.persistence.relief.entity.UserAccessBlockEntity;

import java.util.List;

public interface UserAccessBlockerRepository {
    List<UserAccessBlock> findByUserId(Long userId);
}
