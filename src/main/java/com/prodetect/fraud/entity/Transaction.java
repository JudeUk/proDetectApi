package com.prodetect.fraud.entity;

import lombok.Data;

@Data
public class Transaction {


    private String sourceCountry;

    private String destinationCountry;

    private String currency;



    private String lastName;

    private String nationality;


    private String receiverFirstName;

    private String receiverLastName;

    private String firstName;

    private int transactionAmount;

    private String transactionType;

    private String device;

    private String ip;

    private String deviceId;
}
