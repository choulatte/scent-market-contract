package com.choulatte.scentcontract.scheduler;

import com.choulatte.scentcontract.service.ContractService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ContractScheduler {

    private final ContractService contractService;

    @Scheduled(cron = "0 0 * * * *", zone = "Asia/Seoul")
    void signContracts() {

    }
}
