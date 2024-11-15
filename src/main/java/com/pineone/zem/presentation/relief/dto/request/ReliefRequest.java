package com.pineone.zem.presentation.relief.dto.request;

import com.pineone.zem.domain.relief.aggregate.DisplayDistance;
import com.pineone.zem.domain.relief.aggregate.Smombie;
import jakarta.validation.constraints.NotNull;


public class ReliefRequest {

    @NotNull
    private Long id;

    @NotNull
    private Long userId;

    @NotNull
    private Boolean isDangerSiteOn;

    @NotNull
    private Boolean isAccessBlockerOn;

    @NotNull
    private Boolean isBrowserOn;

    @NotNull
    private Boolean isPaymentBlockOn;

    private Smombie smombie;

    private DisplayDistance displayDistance;

    @NotNull
    private Boolean isBlueLightBlockOn;

    @NotNull
    private Boolean isGoogleLocationOn;

    @NotNull
    private Boolean isPermissionOn;

    @NotNull
    private Boolean isAppDeleteOn;

    @Override
    public String toString() {
        return "ReliefRequest{" +
                "id=" + id +
                ", userId=" + userId +
                ", isDangerSiteOn=" + isDangerSiteOn +
                ", isAccessBlockerOn=" + isAccessBlockerOn +
                ", isBrowserOn=" + isBrowserOn +
                ", isPaymentBlockOn=" + isPaymentBlockOn +
                ", smombie=" + smombie.getSmombieStep()+ smombie.getIsSmombieOn() +
                ", displayDistance=" + displayDistance.getDisplayDistanceStep()+displayDistance.getIsDisplayDistanceOn() +
                ", isBlueLightBlockOn=" + isBlueLightBlockOn +
                ", isGoogleLocationOn=" + isGoogleLocationOn +
                ", isPermissionOn=" + isPermissionOn +
                ", isAppDeleteOn=" + isAppDeleteOn +
                '}';
    }
}
