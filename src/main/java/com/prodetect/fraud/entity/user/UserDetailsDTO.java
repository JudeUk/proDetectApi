package com.prodetect.fraud.entity.user;


import com.prodetect.fraud.entity.apiKey.ApiKey;
import com.prodetect.fraud.entity.company.CompanyDTO;
import com.prodetect.fraud.entity.rules.RulesDTO;
import lombok.Data;

import java.util.List;

@Data
public class UserDetailsDTO {

    private Long id;
    private String userName;
    private String lastName;
    private String firstName;
    private List<CompanyDTO> company;
    private List<RulesDTO> rule;
    private List<ApiKey> apiKeys;
    private String email;
}
