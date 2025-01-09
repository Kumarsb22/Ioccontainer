package com.kumar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.kumar.repository.EmpRepo;
import com.kumar.service.EmpService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmpService empService = context.getBean(EmpService.class);
		EmpRepo empRepo = context.getBean(EmpRepo.class);
		System.out.println(empRepo.getClass());
		empService.save();
		empService.saveAll();
		empService.count();
		empService.existById();
		empService.findById();
		empService.findByAllId();
		empService.findAll();
		empService.deleteById();
		empService.save();
		empService.deleteAllById();
		empService.saveAll();
		empService.deleteAll();
		empService.saveAll();
		empService.delete();
		empService.save();
		empService.deleteAllObj();
		empService.saveAll();
		empService.findByEmpDep();
		empService.findByEmpGend();
		empService.findByEmpName();
		empService.findByEmpSal();
		empService.findByEmpDepAndEmpGend();
		empService.findByEmpDepAndEmpGendAndEmpName();
		empService.findByEmpDepAndEmpGendAndEmpNameAndEmpSal();
		empService.findByEmpSalAndEmpName();
		empService.findByEmpSalGreaterThanEqual();
	}

}
