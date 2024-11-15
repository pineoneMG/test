package com.pineone.zem.infrastructure.persistence.relief.mapper;

import com.pineone.zem.domain.relief.aggregate.BrowserBlockPackage;
import com.pineone.zem.infrastructure.persistence.relief.entity.BrowserBlockEntity;
import java.util.List;
import java.util.stream.Collectors;

public class BrowserBlockMapper {

    public static List<BrowserBlockPackage> toModel(List<BrowserBlockEntity> browserBlockEntities) {
        if (browserBlockEntities == null || browserBlockEntities.isEmpty()) {
            return null;
        }

        return browserBlockEntities.stream()
                .map(entity -> new BrowserBlockPackage(entity.getId(),entity.getPackageId(), entity.getPackageName(),entity.getPackageKoName(),entity.getClassName()))
                .collect(Collectors.toList());

    }
}
