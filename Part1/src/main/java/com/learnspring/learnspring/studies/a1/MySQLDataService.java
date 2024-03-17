package com.learnspring.learnspring.studies.a1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("mySQLDataService")
class MySQLDataService implements DataService {

    public int[] retrieveData() {
        return new int[] { 1, 2, 3, 4, 5 };
    }

}
