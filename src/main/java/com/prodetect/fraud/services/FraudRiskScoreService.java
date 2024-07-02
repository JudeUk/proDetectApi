package com.prodetect.fraud.services;


import com.prodetect.fraud.entity.FraudRiskScore;
import com.prodetect.fraud.repository.FraudRiskScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FraudRiskScoreService {

    @Autowired
    private final FraudRiskScoreRepository fraudRiskScoreRepository;

    @Autowired
    public FraudRiskScoreService(FraudRiskScoreRepository fraudRiskScoreRepository) {
        this.fraudRiskScoreRepository = fraudRiskScoreRepository;
    }

    public FraudRiskScore savefraudRiskScore(FraudRiskScore fraudRiskScore) {

        return fraudRiskScoreRepository.save(fraudRiskScore);
    }

    public List<FraudRiskScore> getAllFraudRiskScore() {
        return fraudRiskScoreRepository.findAll();
    }

}
