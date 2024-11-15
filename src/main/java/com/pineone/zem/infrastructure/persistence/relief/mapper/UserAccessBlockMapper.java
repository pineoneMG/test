package com.pineone.zem.infrastructure.persistence.relief.mapper;

import com.pineone.zem.domain.relief.aggregate.Relief;
import com.pineone.zem.domain.relief.aggregate.UserAccessBlock;
import com.pineone.zem.infrastructure.persistence.relief.entity.UserAccessBlockEntity;

import java.util.List;
import java.util.stream.Collectors;

public class UserAccessBlockMapper {

    public static List<UserAccessBlock> mapToUserAccessBlocks(List<UserAccessBlockEntity> entities) {
        return entities.stream()
                .map(entity -> new UserAccessBlock(entity.getId(),entity.getUserId(), entity.getPackageIdx(),entity.getIsOn()))
                .collect(Collectors.toList());
    }
}
