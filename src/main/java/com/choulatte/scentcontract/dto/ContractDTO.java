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
public class ContractDTO {
    private Long contractId;
    private Long userId;
    private Long accountId;
    private Long productId;
    private Date registeredDate;
    private Date lastModifiedDate;
    private Contract.StatusType statusType;
    private Boolean validity;

    public Contract toEntity() {
        return Contract.builder().userId(this.userId)
                .accountId(this.accountId)
                .productId(this.productId)
                .registeredDate(new Date())
                .lastModifiedDate(new Date())
                .statusType(Contract.StatusType.BEFORE_TRANSACTION)
                .validity(true).build();
    }
}
