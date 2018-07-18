package com.crmcloud.dev;

import com.crmcloud.dev.entity.Table;
import com.crmcloud.dev.repository.MongodbProvider;
import com.mongodb.DBObject;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
public class DevApplication {

	@Autowired
	private MongodbProvider mongodbProvider;

	public static void main(String[] args) {
		SpringApplication.run(DevApplication.class, args);
	}

	@RequestMapping(value = "/")
	public List<DBObject> getIndex(){
		Table tb = new Table();
		tb.setName("S_ACCNT");
		tb.setUserName("Account");
		mongodbProvider.save(tb);
		List<DBObject> list = mongodbProvider.findAll("tables");
		return list;
	}

	@RequestMapping(value = "/{app}/{msg}")
	public void getBuscompData(){}
	
}

