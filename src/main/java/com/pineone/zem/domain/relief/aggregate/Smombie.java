package com.pineone.zem.domain.relief.aggregate;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Smombie {
    private Boolean isSmombieOn;
    private String smombieStep;

    @JsonCreator
    public Smombie(@JsonProperty("isSmombieOn") Boolean isSmombieOn, @JsonProperty("smombieStep") String smombieStep) {
        this.isSmombieOn = isSmombieOn;
        this.smombieStep = smombieStep;
    }
}
