package com.prodetect.fraud.entity;


import lombok.Data;

@Data
public class CheckTransactionRequest {


    private double amount;
    private String receiverCcy;
    private double receiverAmount;
    private String destinationCountry;
    private String narration;
    private String purpose;
    private String receiverFirstName;
    private String receiverLastName;
    private String receiverNationality;
    private String senderFirstName;
    private String senderLastName;
    private String senderNationality;
    private String sourceCountry;
    private String transactionReference;
    private String senderResidentialAddress;
    private String receiverResidentialAddress;
    private double exchangeRate;
    private String destinationAccountNumber;
    private String destinationBank;


}
