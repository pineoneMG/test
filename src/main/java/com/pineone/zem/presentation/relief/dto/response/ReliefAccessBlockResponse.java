package com.pineone.zem.presentation.relief.dto.response;

import com.pineone.zem.domain.relief.aggregate.AccessBlockBrowser;

import java.util.List;

public class ReliefAccessBlockResponse {
    private List<AccessBlockBrowser> accessBlockBrowsers;

    public ReliefAccessBlockResponse(List<AccessBlockBrowser> accessBlockBrowsers) {
        this.accessBlockBrowsers = accessBlockBrowsers;
    }
}
