package com.prodetect.fraud.entity.company;


import com.prodetect.fraud.entity.user.CreateUserDTO;
import lombok.Data;

import java.util.List;

@Data
public class Company {

    private Long id;
    private CreateUserDTO createdBy;
    private String companyName;

    private String callbackUrl;

    private String companyCounty;

    private List<Long> rulesLists;

    private List<Long> apiKeys;



}
