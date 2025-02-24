package com.prodetect.fraud.repository.RulesRepository;


import com.prodetect.fraud.entity.rules.Rules;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@Repository
//@Qualifier("destinationDataSource")
//@RepositoryRestResource
public interface RulesRepository extends JpaRepository<Rules, Long> {




}
