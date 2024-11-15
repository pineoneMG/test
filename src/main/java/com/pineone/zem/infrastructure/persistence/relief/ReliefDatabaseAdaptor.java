package com.pineone.zem.infrastructure.persistence.relief;

import com.pineone.zem.domain.relief.ReliefRepository;
import com.pineone.zem.domain.relief.aggregate.Relief;
import com.pineone.zem.infrastructure.persistence.relief.entity.ReliefEntity;
import com.pineone.zem.infrastructure.persistence.relief.mapper.ReliefMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class ReliefDatabaseAdaptor implements ReliefRepository {
    private final JpaReliefRepository jpaReliefRepository;


    @Override
    public Optional<Relief> findByUserId(Long userId) {
        return jpaReliefRepository.findByUserId(userId)
                                  .map(ReliefMapper::toModel);
    }

    @Override
    public void updateReliefSettings(Relief relief) {
        ReliefEntity reliefEntity = ReliefMapper.toEntity(relief);
        jpaReliefRepository.save(reliefEntity);
    }

}
