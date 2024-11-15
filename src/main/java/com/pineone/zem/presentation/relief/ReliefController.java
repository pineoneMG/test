package com.pineone.zem.presentation.relief;

import com.pineone.zem.application.relief.ReliefUseCase;
import com.pineone.zem.application.relief.assembler.ReliefAssembler;
import com.pineone.zem.global.dto.ApiResult;
import com.pineone.zem.presentation.relief.dto.request.ReliefRequest;
import com.pineone.zem.presentation.relief.dto.response.ReliefAccessBlockResponse;
import com.pineone.zem.presentation.relief.dto.response.ReliefResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/relief")
@RequiredArgsConstructor
public class ReliefController {

    private final ReliefUseCase reliefUseCase;
    private final ReliefAssembler reliefAssembler;

    @GetMapping("/{userId}")
    public ResponseEntity<ApiResult<ReliefResponse>> getReliefSetting(@PathVariable("userId") Long userId){

        ReliefResponse reliefResponse = reliefUseCase.getReliefSettings(userId);

        return ResponseEntity.ok(ApiResult.ok(reliefResponse));
    }

    @RequestMapping("/edit")
    public ResponseEntity<ApiResult<Void>> updateReliefSetting(@RequestBody @Valid ReliefRequest reliefRequest){
        System.out.println("Received Request: " + reliefRequest.toString());
        reliefUseCase.updateReliefSettings(reliefAssembler.toRegisterReliefCommand(reliefRequest));

        return ResponseEntity.ok(ApiResult.ok());
    }

    @RequestMapping("/browser/{userId}")
    public ResponseEntity<ApiResult<ReliefAccessBlockResponse>> getReliefAccessBlock(@PathVariable("userId") Long userId){

        ReliefAccessBlockResponse reliefAccessBlockResponse = reliefUseCase.getReliefAccessBlockSettings(userId);

        return ResponseEntity.ok(ApiResult.ok(reliefAccessBlockResponse));
    }

    @RequestMapping("/browser/edit")
    public ResponseEntity<ApiResult<Void>> updateReliefAccessBlock(@RequestBody @Valid ReliefRequest reliefRequest){




        return ResponseEntity.ok(ApiResult.ok());
    }
}
