package com.learnspring.learnspring.studies.a1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
class MongoDbDataService implements DataService {

    public int[] retrieveData() {
        return new int[] { 11, 22, 33, 44, 55 };
    }

}
