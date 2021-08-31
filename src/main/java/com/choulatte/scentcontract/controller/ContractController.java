package com.choulatte.scentcontract.controller;

import com.choulatte.scentcontract.dto.ContractDTO;
import com.choulatte.scentcontract.dto.ContractDetailDTO;
import com.choulatte.scentcontract.dto.ContractStatusChangeReqDTO;
import com.choulatte.scentcontract.service.ContractService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contracts")
@AllArgsConstructor
public class ContractController {

    private final ContractService contractService;

    @GetMapping(value = "")
    public ResponseEntity<List<ContractDTO>> getContractList(@RequestHeader(value = "user-idx") String userIdx) {
        return ResponseEntity.ok(contractService.getContractList(Long.parseLong(userIdx)));
    }

    @GetMapping(value = "/{contractIdx}")
    public ResponseEntity<ContractDTO> getContractInfo(@RequestHeader(value = "user-idx") String userIdx,
                                                       @PathVariable(value = "contractIdx") String contractIdx) {
        return ResponseEntity.ok(null);
    }

    @GetMapping(value = "/{contractIdx}/details")
    public ResponseEntity<List<ContractDetailDTO>> getContractDetails(@RequestHeader(value = "user-idx") String userIdx,
                                                                      @PathVariable(value = "contractIdx") String contractIdx) {
        return ResponseEntity.ok(null);
    }

    @PostMapping(value = "/{contractIdx}/status")
    public ResponseEntity<ContractDTO> changeContractStatus(@RequestHeader(value = "user-idx") String userIdx,
                                                            @PathVariable(value = "contractIdx") String contractIdx,
                                                            @RequestBody ContractStatusChangeReqDTO contractStatusChangeReqDTO) {
        return ResponseEntity.ok(null);
    }
}
