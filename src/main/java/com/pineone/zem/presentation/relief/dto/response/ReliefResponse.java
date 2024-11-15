package com.pineone.zem.presentation.relief.dto.response;

import com.pineone.zem.domain.relief.aggregate.DisplayDistance;
import com.pineone.zem.domain.relief.aggregate.Relief;
import com.pineone.zem.domain.relief.aggregate.Smombie;
import lombok.Getter;

public class ReliefResponse {
    Long userId;
    Boolean isDangerSiteOn;
    Boolean isBrowserOn;
    Boolean isPaymentBlockOn;
    Smombie smombie;
    DisplayDistance displayDistance;
    Boolean isBlueLightBlockOn;
    Boolean isGoogleLocationOn;
    Boolean isPermissionOn;
    Boolean isAppDeleteOn;

    private ReliefResponse(Relief relief) {
        this.userId = relief.getUserId();
        this.isDangerSiteOn = relief.getIsDangerSiteOn();
        this.isBrowserOn = relief.getIsBrowserOn();
        this.isPaymentBlockOn = relief.getIsPaymentBlockOn();
        this.smombie = relief.getSmombie();
        this.displayDistance = relief.getDisplayDistance();
        this.isBlueLightBlockOn = relief.getIsBlueLightBlockOn();
        this.isGoogleLocationOn = relief.getIsGoogleLocationOn();
        this.isPermissionOn = relief.getIsPermissionOn();
        this.isAppDeleteOn = relief.getIsAppDeleteOn();
    }

    public static ReliefResponse from(Relief relief) {
        return new ReliefResponse(relief);
    }

}
