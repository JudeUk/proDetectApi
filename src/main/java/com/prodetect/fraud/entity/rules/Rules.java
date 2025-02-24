package com.prodetect.fraud.entity.rules;

import com.prodetect.fraud.entity.company.Company;
import com.prodetect.fraud.entity.user.CreateUserDTO;
import lombok.Data;

@Data
public class Rules {


        private Long id;
        private Company company;

        private CreateUserDTO createdBy;
        private String ruleName;
        private String sendingCountry;

        private String receivingCountry;

        private String currency;

        private String status;

        private String senderFirstName;

        private String senderLastName;

        private String receiverFirstName;

        private String receiverLastName;


        private String senderNationality;

        private String receiverNationality;


        private int transactionAmount;

        private String transactionType;

        private String device;

        private String ip;

        private String deviceId;

}
