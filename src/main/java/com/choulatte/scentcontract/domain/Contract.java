package com.choulatte.scentcontract.domain;

import com.choulatte.scentcontract.dto.ContractDTO;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "contract", indexes = {@Index(columnList = "user_idx")})
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contract_idx")
    private Long contractId;

    @Column(name = "user_idx", nullable = false)
    private Long userId;

    @Column(name = "account_idx", nullable = false)
    private Long accountId;

    @Column(name = "product_idx", nullable = false)
    private Long productId;

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "registered_date", nullable = false)
    private Date registeredDate;

    @Setter
    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "last_modified_date", nullable = false)
    private Date lastModifiedDate;

    @Column(name = "status_type", nullable = false)
    @Enumerated(value = EnumType.STRING)
    private StatusType statusType;

    @Setter
    @Column(name = "validity", nullable = false)
    private Boolean validity;

    @OneToMany(mappedBy = "contract")
    private List<ContractDetail> contractDetailList;

    public enum StatusType {
        BEFORE_TRANSACTION, AFTER_TRANSACTION, TRANSACTION_ERROR, CLOSED,
        WITHDRAWAL_REQUESTED, WITHDRAWAL_ACCEPTED, WITHDRAWAL_REJECTED, CANCEL_ERROR, CANCELLED
    }

    public ContractDTO toDTO() {
        return ContractDTO.builder().contractId(this.contractId)
                .userId(this.userId)
                .accountId(this.accountId)
                .productId(this.productId)
                .registeredDate(this.registeredDate)
                .lastModifiedDate(this.lastModifiedDate)
                .statusType(this.statusType)
                .validity(this.validity).build();
    }
}
