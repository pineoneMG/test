package com.pineone.zem.domain.relief.aggregate;

import lombok.Getter;

@Getter
public class BrowserBlockPackage {
    private Long id;
    private Long packageId;
    private String packageName;
    private String packageKoName;
    private String className;

    public BrowserBlockPackage(Long id, String packageId, String packageName, String packageKoName, String className) {
    }
}
