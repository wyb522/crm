package com.crmcloud.dev.repository;

import com.mongodb.DBObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MongodbProvider {

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<DBObject> findAll(String bcName){
        return mongoTemplate.findAll(DBObject.class,bcName);
    }

    public void save(Object obj){
        mongoTemplate.save(obj);
    }

}
