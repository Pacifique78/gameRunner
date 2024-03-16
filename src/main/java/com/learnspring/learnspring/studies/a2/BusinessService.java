package com.learnspring.learnspring.studies.a2;

import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
class BusinessService {
    private DataService dataService;

    @Inject
    public void setDataService(DataService dataService) {
        System.out.println("Setter injection");
        this.dataService = dataService;
    }

    public DataService getDataService() {
        return this.dataService;
    }

}
