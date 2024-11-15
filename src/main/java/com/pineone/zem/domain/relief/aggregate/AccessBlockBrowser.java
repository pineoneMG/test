package com.pineone.zem.domain.relief.aggregate;

import lombok.Getter;
import java.util.ArrayList;
import java.util.List;

@Getter
public class AccessBlockBrowser {
    private Long packageId;
    private String packageName;
    private String packageKoName;
    private Boolean isBlockOn;

    public AccessBlockBrowser(BrowserBlockPackage blockPackage, Boolean isBlockOn) {
        this.packageId = blockPackage.getPackageId();
        this.packageName = blockPackage.getPackageName();
        this.packageKoName = blockPackage.getPackageKoName();
        this.isBlockOn = isBlockOn;
    }

    public static List<AccessBlockBrowser> makeUserAccessBlocks(List<BrowserBlockPackage> sortedBlockPackages, List<UserAccessBlock> userAccessBlock) {
        List<AccessBlockBrowser> accessBlockBrowserList = new ArrayList<>();

        for(BrowserBlockPackage blockPackage : sortedBlockPackages){
            UserAccessBlock findUserAccessBlock = userAccessBlock.stream()
                                                                .filter(h -> h.getPackageIdx().equals(blockPackage.getPackageId()))
                                                                .findFirst()
                                                                .orElseGet(() -> {
                                                                    UserAccessBlock defaultBlock = new UserAccessBlock();
                                                                    defaultBlock.setIsBlockOn(Boolean.FALSE);
                                                                    return defaultBlock;
                                                                });

            AccessBlockBrowser accessBlockBrowser = new AccessBlockBrowser(blockPackage, findUserAccessBlock.getIsBlockOn());
            accessBlockBrowserList.add(accessBlockBrowser);
        }


        return accessBlockBrowserList;
    }
}
