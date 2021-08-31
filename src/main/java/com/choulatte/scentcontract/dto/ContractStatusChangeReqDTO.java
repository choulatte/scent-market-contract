package com.choulatte.scentcontract.dto;

import com.choulatte.scentcontract.domain.Contract;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class ContractStatusChangeReqDTO {
    private Long contractId;
    private Contract.StatusType statusType;
}
