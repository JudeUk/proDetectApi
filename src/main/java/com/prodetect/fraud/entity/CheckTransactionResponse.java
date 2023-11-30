package com.prodetect.fraud.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CheckTransactionResponse {
    private String responseCode;
    private String responseMessage;
    private String token;
    private String complianceId;
    private List<Object> data = new ArrayList<>();


}
