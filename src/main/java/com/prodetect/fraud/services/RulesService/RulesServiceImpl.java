package com.prodetect.fraud.services.RulesService;


import com.prodetect.fraud.entity.rules.Rules;
import com.prodetect.fraud.entity.rules.RulesDTO;
import com.prodetect.fraud.repository.RulesRepository.RulesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class RulesServiceImpl implements RulesService {


    @Autowired
    RulesRepository rulesRepository;

    private final static Logger logger = LoggerFactory.getLogger(RulesServiceImpl.class);
    @Override
    public String createRule(RulesDTO ruleDto) {

        Rules rule = new Rules();

        try {
            rule.setRuleName(ruleDto.getRuleName());
            rule.setStatus(ruleDto.getStatus());
            rule.setCurrency(ruleDto.getCurrency());
            rule.setIp(ruleDto.getIp());
            rule.setDevice(ruleDto.getDevice());
            rule.setDeviceId(ruleDto.getDeviceId());
            rule.setSenderFirstName(ruleDto.getSenderFirstName());
            rule.setSenderFirstName(ruleDto.getSenderFirstName());
            rule.setSenderNationality(ruleDto.getSenderNationality());
            rule.setSendingCountry(ruleDto.getSendingCountry());
            rule.setReceiverFirstName(ruleDto.getReceiverFirstName());
            rule.setReceiverLastName(ruleDto.getReceiverLastName());
            rule.setReceiverNationality(ruleDto.getReceiverNationality());
            rule.setReceivingCountry(ruleDto.getReceivingCountry());
            rule.setTransactionAmount(ruleDto.getTransactionAmount());
            rule.setTransactionType(ruleDto.getTransactionType());
            rulesRepository.save(rule);
        }
        catch(Throwable ex){

            logger.info("Throwable caught"+ ex.getMessage());
            System.out.println("Throwable caught "+ ex.getMessage());

            logger.info("Reason :" + Arrays.toString(ex.getStackTrace()).replace(",","\n"));
            System.out.println("Reason :" + Arrays.toString(ex.getStackTrace()).replace(",","\n"));

        }

        return "rule created successfully";
    }


    @Override
    public String manageRuleStatus() {
        return null;
    }

    @Override
    public String getRuleWithRuleId() {
        return null;
    }

    @Override
    public String getAllRules() {
        return null;
    }


}
