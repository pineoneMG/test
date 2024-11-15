package com.pineone.zem.application.relief.assembler;

import com.pineone.zem.application.relief.dto.ReliefRegisterCommand;
import com.pineone.zem.presentation.relief.dto.request.ReliefRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ReliefAssembler {

    public ReliefRegisterCommand toRegisterReliefCommand(ReliefRequest reliefRequest) {
        ReliefRegisterCommand reliefRegisterCommand = new ReliefRegisterCommand();
        BeanUtils.copyProperties(reliefRequest, reliefRegisterCommand);
        return reliefRegisterCommand;
    }
}
