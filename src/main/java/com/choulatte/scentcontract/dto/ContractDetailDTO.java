package com.choulatte.scentcontract.dto;

import com.choulatte.scentcontract.domain.Contract;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class ContractDetailDTO {
    private Long contractDetailId;
    private Long contractId;
    private Date modifiedDate;
    private Contract.StatusType previousStatusType;
    private Contract.StatusType statusType;
}
