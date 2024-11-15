package com.pineone.zem.domain.relief.aggregate;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DisplayDistance {
    private Boolean isDisplayDistanceOn;
    private String displayDistanceStep;

    @JsonCreator
    public DisplayDistance(@JsonProperty("isDisplayDistanceOn") Boolean isDisplayDistanceOn, @JsonProperty("displayDistanceStep") String displayDistanceStep) {
        this.isDisplayDistanceOn = isDisplayDistanceOn;
        this.displayDistanceStep = displayDistanceStep;
    }
}
