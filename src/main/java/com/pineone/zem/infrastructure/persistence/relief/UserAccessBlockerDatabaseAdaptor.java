package com.pineone.zem.infrastructure.persistence.relief;

import com.pineone.zem.domain.relief.UserAccessBlockerRepository;
import com.pineone.zem.domain.relief.aggregate.UserAccessBlock;
import com.pineone.zem.infrastructure.persistence.relief.entity.UserAccessBlockEntity;
import com.pineone.zem.infrastructure.persistence.relief.mapper.UserAccessBlockMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserAccessBlockerDatabaseAdaptor implements UserAccessBlockerRepository {

    private final JpaUserAccessBlockerRepository jpaUserAccessBlockerRepository;

    @Override
    public List<UserAccessBlock> findByUserId(Long userId) {
        List<UserAccessBlockEntity> accessBlocks = jpaUserAccessBlockerRepository.findByUserId(userId);

        return UserAccessBlockMapper.mapToUserAccessBlocks(accessBlocks);
    }
}
