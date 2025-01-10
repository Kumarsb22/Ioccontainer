package com.kumar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;

import com.kumar.repository.EmpRepo;
import com.kumar.service.EmpService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmpService empService = context.getBean(EmpService.class);
		EmpRepo empRepo = context.getBean(EmpRepo.class);
		System.out.println(empRepo.getClass());
//		System.out.println("All Jpql predefined methods");
//		empService.save();
//		empService.saveAll();
//		empService.count();
//		empService.existById();
//		empService.findById();
//		empService.findByAllId();
//		empService.findAll();
//		empService.deleteById();
//		empService.save();
//		empService.deleteAllById();
//		empService.saveAll();
//		empService.deleteAll();
//		empService.saveAll();
//		empService.delete();
//		empService.save();
//		empService.deleteAllObj();
		//empService.saveAll();
		
		
//		System.out.println("All findBy methods");
//		empService.findByEmpDep();
//		empService.findByEmpGend();
//		empService.findByEmpName();
//		empService.findByEmpSal();
//		empService.findByEmpDepAndEmpGend();
//		empService.findByEmpDepAndEmpGendAndEmpName();
//		empService.findByEmpDepAndEmpGendAndEmpNameAndEmpSal();
//		empService.findByEmpSalAndEmpName();
//		empService.findByEmpSalGreaterThanEqual();

//		System.out.println("Select operation using sql custom queires");
//		empService.findAllCustomQuerySql();
//		empService.findByEmpGenCustomQuerySql();
//		empService.findByEmpNameCustomQuerySql();

//		System.out.println("Select operation using Hql custom queires");
//		empService.findAllCustomQueryHql();
//		empService.findByEmpGenCustomQueryHql();
//		empService.findByEmpNameCustomQueryHql();
//
		empService.deleteAll();
//		System.out.println("Insrt update delete  operation using custom sql queires");
//	empService.customSqlInsert();
//	empService.customSqlUpdate();
//		empService.customSqlDelete();

//		System.out.println("Insrt update delete  operation using custom hql queires");
//		empService.customHqlInsert();
//		empService.customHqlUpdate();
//		empService.customHqlDelete();
//
		System.out.println("Insrt update delete  operation using custom jpql queires");
		empService.customJpqlInsert();
		empService.customJpqlUpdate();
		empService.customJpqlDelete();
		
//		@Transactional
//		@Modifying
		//above annotaion used methods return void or int/Integser
	}

}
