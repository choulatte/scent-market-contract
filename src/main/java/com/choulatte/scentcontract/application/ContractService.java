package com.choulatte.scentcontract.application;

import com.choulatte.scentcontract.dto.CancelReqDTO;
import com.choulatte.scentcontract.dto.ContractDTO;
import com.choulatte.scentcontract.dto.ConfirmReqDTO;
import com.choulatte.scentcontract.dto.ContractReqDTO;

import java.util.List;

public interface ContractService {
    List<ContractDTO> getContractList(Long userId);
    ContractDTO getContract(ContractReqDTO contractReqDTO);
    ContractDTO confirmContract(ConfirmReqDTO confirmReqDTO);
    ContractDTO cancelContract(CancelReqDTO cancelReqDTO);
}
