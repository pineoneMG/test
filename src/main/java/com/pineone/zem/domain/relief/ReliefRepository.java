package com.pineone.zem.domain.relief;

import com.pineone.zem.domain.relief.aggregate.Relief;

import java.util.Optional;

public interface ReliefRepository {
    Optional<Relief> findByUserId(Long userId);
    void updateReliefSettings(Relief relief);
}
