package com.choulatte.scentcontract.service;

import com.choulatte.scentcontract.domain.Contract;
import com.choulatte.scentcontract.dto.CancelReqDTO;
import com.choulatte.scentcontract.dto.ConfirmReqDTO;
import com.choulatte.scentcontract.dto.ContractDTO;
import com.choulatte.scentcontract.dto.ContractReqDTO;
import com.choulatte.scentcontract.repository.ContractRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ContractServiceImpl implements ContractService {

    private final ContractRepository contractRepository;

    @Override
    public List<ContractDTO> getContractList(Long userId) {
        return contractRepository.findByUserId(userId).stream().map(Contract::toDTO).collect(Collectors.toList());
    }

    @Override
    public ContractDTO getContract(ContractReqDTO contractReqDTO) {
        return null;
    }

    @Override
    public ContractDTO confirmContract(ConfirmReqDTO confirmReqDTO) {
        return null;
    }

    @Override
    public ContractDTO cancelContract(CancelReqDTO cancelReqDTO) {
        return null;
    }
}
