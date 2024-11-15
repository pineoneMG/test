package com.pineone.zem.infrastructure.persistence.relief;

import com.pineone.zem.infrastructure.persistence.relief.entity.UserAccessBlockEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JpaUserAccessBlockerRepository extends JpaRepository<UserAccessBlockEntity, Long> {
    List<UserAccessBlockEntity> findByUserId(Long userId);
}

