package com.pineone.zem.infrastructure.persistence.relief.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Getter
@Table(name = "tb_tjunior_browser_blocklist")
public class BrowserBlockEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "package_id", nullable = false)
    private String packageId;

    @Column(name = "package_name", nullable = false)
    private String packageName;

    @Column(name = "package_ko_name", nullable = false)
    private String packageKoName;

    @Column(name = "class_name", nullable = false)
    private String className;
}
