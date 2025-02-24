package com.prodetect.fraud.entity.rules;

import com.prodetect.fraud.entity.company.CompanyDTO;
import com.prodetect.fraud.entity.user.CreateUserDTO;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class RulesDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;

    //Many rules can be long to One company
    @ManyToOne
    @JoinColumn(name = "company_id")
    private CompanyDTO company;

    //Many rules can be created by One CreateUserDTO
    @ManyToOne
    @JoinColumn(name = "user_id")
    private CreateUserDTO createdBy;

    @Column(nullable = false)
    private String ruleName;
    @Column(nullable = false)
    private String sendingCountry;

    @Column(nullable = false)
    private String receivingCountry;

    @Column(nullable = false)
    private String currency;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    private String senderFirstName;

    @Column(nullable = false)
    private String senderLastName;

    @Column(nullable = false)
    private String receiverFirstName;

    @Column(nullable = false)
    private String receiverLastName;

    @Column(nullable = false)
    private String senderNationality;

    @Column(nullable = false)
    private String receiverNationality;

    @Column(nullable = false)
    private int transactionAmount;

    @Column(nullable = false)
    private String transactionType;

    @Column(nullable = false)
    private String device;

    @Column(nullable = false)
    private String ip;

    @Column(nullable = false)
    private String deviceId;


}
