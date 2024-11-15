package com.pineone.zem.infrastructure.persistence.relief.mapper;

import com.pineone.zem.domain.relief.aggregate.DisplayDistance;
import com.pineone.zem.domain.relief.aggregate.Relief;
import com.pineone.zem.domain.relief.aggregate.Smombie;
import com.pineone.zem.infrastructure.persistence.relief.entity.ReliefEntity;

public class ReliefMapper {

    public static Relief toModel(ReliefEntity entity) {
        if (entity == null) {
            return null;
        }
        return new Relief(
                entity.getId(),
                entity.getUserId(),
                entity.getIsDangerSiteOn(),
                entity.getIsAccessBlockerOn(),
                entity.getIsBrowserOn(),
                entity.getIsPaymentBlockOn(),
                getSmombieFromRelief(entity),
                getDisplayDistanceFromRelief(entity),
                entity.getIsBlueLightBlockOn(),
                entity.getIsGoogleLocationOn(),
                entity.getIsPermissionOn(),
                entity.getIsAppDeleteOn()
        );
    }
    public static Smombie getSmombieFromRelief(ReliefEntity entity) {
        if (entity == null) {
            return null;
        }

        return new Smombie(
                entity.getIsSmombieOn(),
                entity.getSmombieStep()
        );
    }

    public static DisplayDistance getDisplayDistanceFromRelief(ReliefEntity entity) {
        if (entity == null) {
            return null;
        }
        return new DisplayDistance(
                entity.getIsDisplayDistanceOn(),
                entity.getDisplayDistanceStep()
        );
    }

    public static ReliefEntity toEntity(Relief relief) {
        if (relief == null) {
            return null;
        }
        ReliefEntity reliefEntity = new ReliefEntity(
                relief.getId(),
                relief.getUserId(),
                relief.getIsDangerSiteOn(),
                relief.getIsAccessBlockerOn(),
                relief.getIsBrowserOn(),
                relief.getIsPaymentBlockOn(),
                relief.getSmombie().getIsSmombieOn(),
                relief.getSmombie().getSmombieStep(),
                relief.getDisplayDistance().getIsDisplayDistanceOn(),
                relief.getDisplayDistance().getDisplayDistanceStep(),
                relief.getIsBlueLightBlockOn(),
                relief.getIsGoogleLocationOn(),
                relief.getIsPermissionOn(),
                relief.getIsAppDeleteOn()
        );

        return reliefEntity;
    }

}
