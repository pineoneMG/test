package com.pineone.zem.infrastructure.persistence.relief;

import com.pineone.zem.domain.relief.BrowserBlockRepository;
import com.pineone.zem.domain.relief.aggregate.BrowserBlockPackage;
import com.pineone.zem.infrastructure.persistence.relief.entity.BrowserBlockEntity;
import com.pineone.zem.infrastructure.persistence.relief.mapper.BrowserBlockMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BrowserBlockDatabaseAdaptor implements BrowserBlockRepository {
    private final JpaBrowserBlockRepository jpaBrowserBlockRepository;


    @Override
    public List<BrowserBlockPackage> findAll() {
        List<BrowserBlockEntity> entities = jpaBrowserBlockRepository.findAll();

        return BrowserBlockMapper.toModel(entities);
    }
}
