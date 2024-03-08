package com.learnspring.learnspring.studies.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
class BusinessCalculationService {
    private DataService dataService;

    public BusinessCalculationService(@Qualifier("mySQLDataService") DataService dataService) {
        this.dataService = dataService;
    }

    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }

}
