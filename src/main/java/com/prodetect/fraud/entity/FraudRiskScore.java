package com.prodetect.fraud.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
public class FraudRiskScore {


    @Id
    private int transactionId;
    private int score;
    private LocalDateTime transactionDate;

    private int sourceAmount;

    private String sourceCountry;

    private int descAmount;

    private String descCountry;

}
