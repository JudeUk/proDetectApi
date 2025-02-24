package com.prodetect.fraud.entity.company;


import com.prodetect.fraud.entity.apiKey.ApiKey;
import com.prodetect.fraud.entity.rules.RulesDTO;
import com.prodetect.fraud.entity.user.User;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
public class CompanyDTO {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    // One company can have Many Rules
    @OneToMany(mappedBy = "company")
    @Column(nullable = false)
    private List<RulesDTO> rulesList;


    // Many companies can be created by One user
    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false)
    private User createdBy;


    // One company can have Many apiKeys expired or not expired, active or inactive
    @OneToMany(mappedBy = "company")
    @Column(nullable = false)
    private List<ApiKey> apiKeys;


    @Column(nullable = false)
    private String companyName;

    @Column(nullable = false)
    private String callbackUrl;

    @Column(nullable = false)
    private String companyCounty;



}
