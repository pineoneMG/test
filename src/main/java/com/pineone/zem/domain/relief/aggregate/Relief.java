package com.pineone.zem.domain.relief.aggregate;

import com.pineone.zem.application.relief.dto.ReliefRegisterCommand;
import lombok.Getter;

import java.util.List;

@Getter
public class Relief {
    private Long id;
    private Long userId;
    private Boolean isDangerSiteOn;
    private Boolean isAccessBlockerOn;
    private Boolean isBrowserOn;
    private Boolean isPaymentBlockOn;
    private Smombie smombie;
    private DisplayDistance displayDistance;
    private Boolean isBlueLightBlockOn;
    private Boolean isGoogleLocationOn;
    private Boolean isPermissionOn;
    private Boolean isAppDeleteOn;
    private List<UserAccessBlock> appList;

    public Relief(Long id, Long userId, Boolean isDangerSiteOn, Boolean isAccessBlockerOn, Boolean isBrowserOn, Boolean isPaymentBlockOn, Smombie smombie, DisplayDistance displayDistance, Boolean isBlueLightBlockOn, Boolean isGoogleLocationOn, Boolean isPermissionOn, Boolean isAppDeleteOn) {
        this.id = id;
        this.userId = userId;
        this.isDangerSiteOn = isDangerSiteOn;
        this.isAccessBlockerOn = isAccessBlockerOn;
        this.isBrowserOn = isBrowserOn;
        this.isPaymentBlockOn = isPaymentBlockOn;
        this.smombie = smombie;
        this.displayDistance = displayDistance;
        this.isBlueLightBlockOn = isBlueLightBlockOn;
        this.isGoogleLocationOn = isGoogleLocationOn;
        this.isPermissionOn = isPermissionOn;
        this.isAppDeleteOn = isAppDeleteOn;
    }

    public void setUserAccessBlocks(List<UserAccessBlock> appList) {
        this.appList = appList;
    }

    public static Relief fromCommand(ReliefRegisterCommand request) {
        return new Relief(request.getId(), request.getUserId(),request.getIsDangerSiteOn(),request.getIsAccessBlockerOn(),request.getIsBrowserOn(),request.getIsPaymentBlockOn(),request.getSmombie(),request.getDisplayDistance(),request.getIsBlueLightBlockOn(),request.getIsGoogleLocationOn(),request.getIsPermissionOn(),request.getIsAppDeleteOn());
    }

}
