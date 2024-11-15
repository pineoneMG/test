package com.pineone.zem.presentation.relief.dto.response;

import com.pineone.zem.domain.relief.aggregate.DisplayDistance;
import com.pineone.zem.domain.relief.aggregate.Relief;
import com.pineone.zem.domain.relief.aggregate.Smombie;
import lombok.Getter;

@Getter
public class ReliefResponse {
    private Long userId;
    private Boolean isDangerSiteOn;
    private Boolean isBrowserOn;
    private Boolean isPaymentBlockOn;
    private Smombie smombie;
    private DisplayDistance displayDistance;
    private Boolean isBlueLightBlockOn;
    private Boolean isGoogleLocationOn;
    private Boolean isPermissionOn;
    private Boolean isAppDeleteOn;

    public ReliefResponse(Relief relief) {
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

}
