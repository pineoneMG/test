package com.pineone.zem.infrastructure.persistence.relief;

import com.pineone.zem.infrastructure.persistence.relief.entity.ReliefEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JpaReliefRepository extends JpaRepository<ReliefEntity, Long> {
    Optional<ReliefEntity> findByUserId(Long userId);
}
