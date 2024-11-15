package com.pineone.zem.application.relief.dto;

import com.pineone.zem.domain.relief.aggregate.DisplayDistance;
import com.pineone.zem.domain.relief.aggregate.Smombie;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class ReliefRegisterCommand {
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
}
