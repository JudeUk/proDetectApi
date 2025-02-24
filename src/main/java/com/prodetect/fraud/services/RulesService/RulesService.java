package com.prodetect.fraud.services.RulesService;


import com.prodetect.fraud.entity.rules.Rules;
import com.prodetect.fraud.entity.rules.RulesDTO;
import org.springframework.stereotype.Service;


public interface RulesService {

    public String createRule(RulesDTO rule);

    public String manageRuleStatus();

    public String getRuleWithRuleId();


    public String getAllRules();

}
