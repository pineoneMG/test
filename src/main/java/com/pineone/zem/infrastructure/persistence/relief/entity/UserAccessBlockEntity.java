package com.pineone.zem.infrastructure.persistence.relief.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Getter
@Table(name = "tb_tjunior_browser_blocklist")
public class UserAccessBlockEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "package_idx", nullable = false)
    private Long packageIdx;

    @Column(name = "status", nullable = false)
    private Boolean isOn;
}
