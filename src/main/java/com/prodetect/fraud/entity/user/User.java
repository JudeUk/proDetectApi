package com.prodetect.fraud.entity.user;


import com.prodetect.fraud.entity.apiKey.ApiKey;
import com.prodetect.fraud.entity.company.CompanyDTO;
import com.prodetect.fraud.entity.rules.RulesDTO;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    //One CreateUserDTO can create many companies
    @OneToMany(mappedBy = "user")
    private List<CompanyDTO> company;

    @OneToMany(mappedBy = "createdBy")
    private List<RulesDTO> rule;
    @OneToMany(mappedBy = "user")
    private List<ApiKey> apiKeys;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String userName;

    @Column(nullable = false)
    private String password;



}
