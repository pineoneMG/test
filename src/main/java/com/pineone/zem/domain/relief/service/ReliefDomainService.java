package com.pineone.zem.domain.relief.service;


import com.pineone.zem.domain.relief.BrowserBlockRepository;
import com.pineone.zem.domain.relief.ReliefRepository;
import com.pineone.zem.domain.relief.UserAccessBlockerRepository;
import com.pineone.zem.domain.relief.aggregate.AccessBlockBrowser;
import com.pineone.zem.domain.relief.aggregate.BrowserBlockPackage;
import com.pineone.zem.domain.relief.aggregate.Relief;
import com.pineone.zem.domain.relief.aggregate.UserAccessBlock;
import com.pineone.zem.global.exception.NoDataException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ReliefDomainService {
    private final ReliefRepository reliefRepository;
    private final BrowserBlockRepository browserBlockRepository;
    private final UserAccessBlockerRepository userAccessBlockerRepository;

    public Relief getReliefSettings(Long userId) {

        return reliefRepository.findByUserId(userId)
                                        .orElseThrow(()-> new NoDataException("안심설정 데이터가 없습니다. userId : "+ userId));
    }

    public void updateReliefSettings(Relief reliefSettings) {

        reliefRepository.findByUserId(reliefSettings.getUserId())
                        .orElseThrow(()-> new NoDataException("안심설정 데이터가 없습니다. userId : "+ reliefSettings.getUserId()));

        reliefRepository.updateReliefSettings(reliefSettings);
    }

    public List<AccessBlockBrowser> getReliefAccessBlockSettings(Long userId){
        // 어드민에서 등록된 패키지 리스트들 가져온다.
        List<BrowserBlockPackage> browserBlockPackages = browserBlockRepository.findAll();

        List<BrowserBlockPackage> sortedBlockPackages = new ArrayList<>(browserBlockPackages.stream()
                                                                                             .collect(Collectors.toConcurrentMap(BrowserBlockPackage::getPackageId, Function.identity(), (p, g) -> p))
                                                                                             .values());

        // 사용자가 설정한 우회 등록 패키지 설정값 가져온다.
        List<UserAccessBlock> userAccessBlock = userAccessBlockerRepository.findByUserId(userId);

        // 사용자가 설정한 값과 어드민 등록된 패키지 리스트 비교 후 사용자 우회 등록 상태 세팅
        List<AccessBlockBrowser> accessBlockBrowsers;

        if(!browserBlockPackages.isEmpty()){

            accessBlockBrowsers = AccessBlockBrowser.makeUserAccessBlocks(sortedBlockPackages, userAccessBlock);

        }else{
            throw new NoDataException("어드민에 등록된 패키지 정보가 없습니다.");
        }

        return accessBlockBrowsers;
    }

}
