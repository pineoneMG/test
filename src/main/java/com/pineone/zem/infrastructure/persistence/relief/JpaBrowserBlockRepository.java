package com.pineone.zem.infrastructure.persistence.relief;

import com.pineone.zem.infrastructure.persistence.relief.entity.BrowserBlockEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JpaBrowserBlockRepository extends JpaRepository<BrowserBlockEntity, Long> {
    List<BrowserBlockEntity> findAll();
}
