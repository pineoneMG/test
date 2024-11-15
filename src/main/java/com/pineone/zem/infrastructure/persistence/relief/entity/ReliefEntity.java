package com.pineone.zem.infrastructure.persistence.relief.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

@NoArgsConstructor
@Entity
@Getter
@Table(name = "tb_tjunior_relief")
public class ReliefEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "danger_site_yn", nullable = false)
    @ColumnDefault("0")
    private Boolean isDangerSiteOn;

    @Column(name = "access_blocker_yn", nullable = false)
    @ColumnDefault("0")
    private Boolean isAccessBlockerOn;

    @Column(name = "browser_yn", nullable = false)
    @ColumnDefault("0")
    private Boolean isBrowserOn;

    @Column(name = "payment_block_yn", nullable = false)
    @ColumnDefault("0")
    private Boolean isPaymentBlockOn;

    @Column(name = "smombie_yn")
    private Boolean isSmombieOn;

    @Column(name = "smombie_step", nullable = false)
    @ColumnDefault("0")
    private String smombieStep;

    @Column(name = "display_distance_yn", nullable = false)
    @ColumnDefault("0")
    private Boolean isDisplayDistanceOn;

    @Column(name = "display_distance_step", nullable = false)
    @ColumnDefault("0")
    private String displayDistanceStep;

    // 수업방해금지 추가 필요

    @Column(name = "bluelight_block_yn", nullable = false)
    @ColumnDefault("0")
    private Boolean isBlueLightBlockOn;

    @Column(name = "google_location_yn", nullable = false)
    @ColumnDefault("0")
    private Boolean isGoogleLocationOn;

    @Column(name = "permission_yn", nullable = false)
    @ColumnDefault("0")
    private Boolean isPermissionOn;

    @Column(name = "app_delete_yn", nullable = false)
    @ColumnDefault("0")
    private Boolean isAppDeleteOn;

    public ReliefEntity(Long id, Long userId, Boolean isDangerSiteOn, Boolean isAccessBlockerOn, Boolean isBrowserOn, Boolean isPaymentBlockOn, Boolean isSmombieOn, String smombieStep, Boolean isDisplayDistanceOn, String displayDistanceStep, Boolean isBlueLightBlockOn, Boolean isGoogleLocationOn, Boolean isPermissionOn, Boolean isAppDeleteOn) {
        this.id = id;
        this.userId = userId;
        this.isDangerSiteOn = isDangerSiteOn;
        this.isAccessBlockerOn = isAccessBlockerOn;
        this.isBrowserOn = isBrowserOn;
        this.isPaymentBlockOn = isPaymentBlockOn;
        this.isSmombieOn = isSmombieOn;
        this.smombieStep = smombieStep;
        this.isDisplayDistanceOn = isDisplayDistanceOn;
        this.displayDistanceStep = displayDistanceStep;
        this.isBlueLightBlockOn = isBlueLightBlockOn;
        this.isGoogleLocationOn = isGoogleLocationOn;
        this.isPermissionOn = isPermissionOn;
        this.isAppDeleteOn = isAppDeleteOn;
    }

}
