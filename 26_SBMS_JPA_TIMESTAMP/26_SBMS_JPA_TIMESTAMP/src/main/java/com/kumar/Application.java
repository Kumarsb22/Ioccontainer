package com.kumar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.kumar.entities.ContactInfoEntity;
import com.kumar.repo.ContactRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ContactRepo contactRepo = context.getBean(ContactRepo.class);
		contactRepo.deleteAll();
		ContactInfoEntity entity=new ContactInfoEntity();
		//entity.setConatactId(1);
		entity.setName("Kumar Balambeed");
		entity.setEmail("kumar@gmail.com");
		entity.setPhoneNo("7022859957");
		contactRepo.save(entity);
		
		contactRepo.findAll().forEach(e->System.out.println(e));
		
		ContactInfoEntity entity2=new ContactInfoEntity();
		entity2.setConatactId(1);
		entity2.setName("Sunil Balambeed");
		entity2.setEmail("sunil@gmail.com");
		entity2.setPhoneNo("7022859957");
		contactRepo.save(entity2);
		
		contactRepo.findAll().forEach(e->System.out.println(e));
	}

}
