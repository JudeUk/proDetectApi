package com.prodetect.fraud.repository;

import com.prodetect.fraud.entity.FraudRiskScore;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;

//@Qualifier("destinationDataSource")
public interface FraudRiskScoreRepository extends JpaRepository<FraudRiskScore, Long> {


}
