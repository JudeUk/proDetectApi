package com.prodetect.fraud.entity.apiKey;

import com.prodetect.fraud.entity.company.Company;
import com.prodetect.fraud.entity.user.CreateUserDTO;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Data
public class ApiKey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    // Many ApiKeys can belong to one company
    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;


    // Many Api keys can be created by one user
    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private CreateUserDTO createdBy;

    @Column(nullable = false)
    private LocalDateTime createdDate;

    @Column(nullable = false)
    private LocalDateTime expiryDate;
    @Column(nullable= false)
    private LocalDateTime lastUsed;


    @Column(nullable = false)
    private String keyValue;

    @Column(nullable = false)
    private String hashedKeyValue;

    @Column(nullable = false)
    private boolean status;



}
