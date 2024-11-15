package com.pineone.zem.application.relief;

import com.pineone.zem.application.relief.dto.ReliefRegisterCommand;
import com.pineone.zem.domain.relief.aggregate.AccessBlockBrowser;
import com.pineone.zem.domain.relief.aggregate.Relief;
import com.pineone.zem.domain.relief.service.ReliefDomainService;
import com.pineone.zem.domain.user.service.UserDomainService;
import com.pineone.zem.presentation.relief.dto.response.ReliefAccessBlockResponse;
import com.pineone.zem.presentation.relief.dto.response.ReliefResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
@RequiredArgsConstructor
public class ReliefUseCase {

    private final ReliefDomainService reliefDomainService;
    private final UserDomainService userDomainService;

    public ReliefResponse getReliefSettings(Long userId){
        userDomainService.validateUser(userId);

        Relief relief = reliefDomainService.getReliefSettings(userId);

        return ReliefResponse.from(relief);
    }

    public void updateReliefSettings(ReliefRegisterCommand reliefRegisterCommand){

        reliefDomainService.updateReliefSettings(Relief.fromCommand(reliefRegisterCommand));

    }

    public ReliefAccessBlockResponse getReliefAccessBlockSettings(Long userId){

        List<AccessBlockBrowser> accessBlockBrowsers = reliefDomainService.getReliefAccessBlockSettings(userId);

        return new ReliefAccessBlockResponse(accessBlockBrowsers);
    }

}
