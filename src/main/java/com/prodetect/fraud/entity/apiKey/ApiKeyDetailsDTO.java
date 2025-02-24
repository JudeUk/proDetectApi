package com.prodetect.fraud.entity.apiKey;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ApiKeyDetailsDTO {


    private Long companyId;

    private Long createdBy;

    private LocalDateTime createdDate;

    private LocalDateTime expiryDate;

    private LocalDateTime lastUsed;

    private String keyValue;

    private String hashedKeyValue;

    private boolean status;


}
