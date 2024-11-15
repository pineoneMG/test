package com.pineone.zem.domain.relief.aggregate;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class UserAccessBlock {
    private Long id;
    private Long userId;
    private Long packageIdx;
    private Boolean isBlockOn;

    public UserAccessBlock(Long id, Long userId, Long packageIdx, Boolean isBlockOn) {
        this.id = id;
        this.userId = userId;
        this.packageIdx = packageIdx;
        this.isBlockOn = isBlockOn;
    }

    public void setIsBlockOn(Boolean isBlockOn) {
        this.isBlockOn = isBlockOn;
    }

    public UserAccessBlock() {}
}
