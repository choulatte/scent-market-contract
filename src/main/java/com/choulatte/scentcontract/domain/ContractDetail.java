package com.choulatte.scentcontract.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "contract_detail")
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contract_detail_idx")
    private Long contractDetailId;

    @ManyToOne(targetEntity = Contract.class)
    @JoinColumn(name = "contract_idx", nullable = false)
    private Contract contract;

    @Setter
    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "modified_date", nullable = false)
    private Date modifiedDate;

    @Column(name = "prev_status_type", nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Contract.StatusType previousStatusType;

    @Column(name = "status_type", nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Contract.StatusType statusType;
}
