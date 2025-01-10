package com.kumar;

import java.util.Arrays;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.kumar.repo.EmpRepo;
import com.kumar.service.EmpService;

@SpringBootApplication
public class Application {
	



	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		EmpRepo empRepo = context.getBean(EmpRepo.class);
		 EmpService empService = context.getBean(EmpService.class);
		Employee employee1 = new Employee(1, "Kumar Balambeed", "Developer", "Male", 100000.00);
		Employee employee2 = new Employee(2, "Manju Balambeed", "Developer", "Male", 100000.00);
		Employee employee3 = new Employee(3, "Manoj Balambeed", "Developer", "Male", 100000.00);
		Employee employee4 = new Employee(4, "Sunil Balambeed", "Developer", "Male", 100000.00);
		Employee employee5 = new Employee(5, "Annapa Balambeed", "Developer", "Male", 100000.00);
		Employee employee6 = new Employee(6, "Gagan Balambeed", "Developer", "Male", 100000.00);
		List<Employee> list = Arrays.asList(employee1, employee2, employee3, employee4, employee5, employee6);
		empRepo.saveAll(list);
		
//		System.out.println("Ascending order");
//		empService.sortEmp("empName", "A");
//		System.out.println("Descending order");
//		empService.sortEmp("empId", "D");
		
//		System.out.println("QBE dyanamic user input");
//		Employee employee=new Employee();
//	//	employee.setEmpId(3);
//		//employee.setEmpName("Sunil Balambeed");
//		employee.setEmpDep("Developer");
//		employee.setEmpGen("Male");
//		empService.qbeEmp(employee);

		
		System.out.println("Pagination");
		System.out.println("Page 1");
		empService.paginationEmp(0, 2);//page no , page size
		System.out.println("Page 2");
		empService.paginationEmp(1, 2);
		System.out.println("Page 3");
		empService.paginationEmp(2, 2);
	}

}
