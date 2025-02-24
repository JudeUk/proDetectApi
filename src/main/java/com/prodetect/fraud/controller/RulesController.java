package com.prodetect.fraud.controller;


import com.prodetect.fraud.entity.Response;
import com.prodetect.fraud.entity.rules.Rules;
import com.prodetect.fraud.entity.rules.RulesDTO;
import com.prodetect.fraud.services.RulesService.RulesService;
import com.prodetect.fraud.utilities.EncryptionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("api/v1/")

public class RulesController {


    public RulesController(RulesService rulesService) {
        this.rulesService = rulesService;
    }

    private final static Logger logger = LoggerFactory.getLogger(RulesController.class);


    @Autowired
    private RulesService rulesService;


    @Autowired
    EncryptionService encryptionService;


    @PostMapping(value = "/createRule",consumes= MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> createRule(@RequestBody String request, final HttpServletRequest httpServletRequest) throws Exception {



        RulesDTO decryptedRulesRequest = new RulesDTO();

        logger.info("Request: " + request);

        decryptedRulesRequest = encryptionService.decryptWithCredentials(request, RulesDTO.class, encryptionService.extractKeys(httpServletRequest));

        logger.info("Decrypted Request: " + decryptedRulesRequest);

        return ResponseEntity.ok(rulesService.createRule(decryptedRulesRequest));

    }



    @PostMapping(value = "/manageRuleStatus", consumes =MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
    public String manageRuleStatus(@RequestBody String request){

        return null;

    }



    @PostMapping(value = "/deleteRule", consumes ="text/plain", produces =MediaType.APPLICATION_JSON_VALUE)
    public String deleteRule(@RequestBody String request){

        return null;
    }



    @PostMapping(value="/getAllRules", consumes="text/plain",produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAllRules(@RequestBody String request){

        return null;
    }




}
