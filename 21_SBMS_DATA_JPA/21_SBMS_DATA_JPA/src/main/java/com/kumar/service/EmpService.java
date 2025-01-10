package com.kumar.service;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kumar.entity.Employee;
import com.kumar.repository.EmpRepo;

@Service
public class EmpService {

	private EmpRepo empRepo;

	public EmpService(EmpRepo empRepo) {
		this.empRepo = empRepo;
	}

	public void save() {
		System.out.println("Save()");
		Employee employee = new Employee(1, "Kumar Balabeed", "Developer", "Male", 100000.00);
		this.empRepo.save(employee);
	}

	public void saveAll() {
		System.out.println("SaveAll()");
		Employee employee1 = new Employee(1, "Kumar Balabeed", "Developer", "Male", 100000.00);
		Employee employee2 = new Employee(2, "Manju Balabeed", "Developer", "Male", 100000.00);
		Employee employee3 = new Employee(3, "Manoj Balabeed", "Developer", "Male", 100000.00);
		Employee employee4 = new Employee(4, "Sunil Balabeed", "Developer", "Male", 100000.00);
		Employee employee5 = new Employee(5, "Annapa Balabeed", "Developer", "Male", 100000.00);
		Employee employee6 = new Employee(6, "Gagan Balabeed", "Developer", "Male", 100000.00);
		List<Employee> list = Arrays.asList(employee1, employee2, employee3, employee4, employee5, employee6);
		this.empRepo.saveAll(list);
	}

	public void findById() {
		System.out.println("findById()");
		Optional<Employee> id = this.empRepo.findById(1);
		if (id.isPresent()) {
			System.out.println(id.get());
		}
	}

	public void findByAllId() {
		System.out.println("findByAllId()");
		Iterable<Employee> iterable = this.empRepo.findAllById(Arrays.asList(1, 2, 3, 4, 5, 6));
		for (Employee employee : iterable) {
			System.out.println(employee);
		}

	}

	public void findAll() {
		System.out.println("findAll()");
		Iterable<Employee> findAll = this.empRepo.findAll();
		for (Employee employee : findAll) {
			System.out.println(employee);
		}

	}

	public void count() {
		System.out.println("count()");
		long count = this.empRepo.count();
		System.out.println(count);
	}

	public void existById() {
		System.out.println("existById()");
		boolean existsById = this.empRepo.existsById(1);
		System.out.println(existsById);

	}

	public void deleteById() {
		System.out.println("deleteById()");
		this.empRepo.deleteById(1);
	}

	public void deleteAllById() {
		System.out.println("deleteAllById()");
		this.empRepo.deleteAllById(Arrays.asList(1, 2, 3, 4, 5, 6));
	}

	public void deleteAll() {
		System.out.println("deleteAllById()");
		this.empRepo.deleteAll();
	}

	public void delete() {
		System.out.println("delete()");
		Employee employee = new Employee(1, "Kumar Balabeed", "Developer", "Male", 100000.00);
		this.empRepo.delete(employee);
	}

	public void deleteAllObj() {
		System.out.println("deleteAllObj()");
		Employee employee1 = new Employee(1, "Kumar Balabeed", "Developer", "Male", 1000000.00);
		Employee employee2 = new Employee(2, "Manju Balabeed", "Developer", "Male", 100000.00);
		Employee employee3 = new Employee(3, "Manoj Balabeed", "Developer", "Male", 100000.00);
		Employee employee4 = new Employee(4, "Sunil Balabeed", "Developer", "Male", 100000.00);
		Employee employee5 = new Employee(5, "Annapa Balabeed", "Developer", "Male", 100000.00);
		Employee employee6 = new Employee(6, "Gagan Balabeed", "Developer", "Male", 100000.00);
		List<Employee> list = Arrays.asList(employee1, employee2, employee3, employee4, employee5, employee6);
		this.empRepo.deleteAll(list);
	}

	public void findByEmpName() {
		System.out.println("findByEmpName()");
		List<Employee> findByEmpName = this.empRepo.findByEmpName("Kumar Balambeed");
		findByEmpName.stream().forEach(e -> System.out.println(e));
	}

	public void findByEmpGend() {
		System.out.println("findByEmpGend()");
		List<Employee> findByEmpName = this.empRepo.findByEmpGen("Male");
		findByEmpName.stream().forEach(e -> System.out.println(e));
	}

	public void findByEmpDep() {
		System.out.println("findByEmpDep()");
		List<Employee> findByEmpName = this.empRepo.findByEmpDep("Developer");
		findByEmpName.stream().forEach(e -> System.out.println(e));
	}

	public void findByEmpSal() {
		System.out.println("findByEmpSal()");
		List<Employee> findByEmpName = this.empRepo.findByEmpSal(100000.00);
		findByEmpName.stream().forEach(e -> System.out.println(e));
	}

	public void findByEmpDepAndEmpGend() {
		System.out.println("findByEmpDepAndEmpGend()");
		List<Employee> findByEmpName = this.empRepo.findByEmpDepAndEmpGen("Developer", "Male");
		findByEmpName.stream().forEach(e -> System.out.println(e));
	}

	public void findByEmpSalAndEmpName() {
		System.out.println("findByEmpSalAndEmpName()");
		List<Employee> findByEmpName = this.empRepo.findByEmpSalAndEmpName(100000.00, "Kumar Balambeed");
		findByEmpName.stream().forEach(e -> System.out.println(e));
	}

	public void findByEmpDepAndEmpGendAndEmpName() {
		System.out.println("findByEmpDepAndEmpGendAndEmpName()");
		List<Employee> findByEmpName = this.empRepo.findByEmpDepAndEmpGenAndEmpName("Developer", "Male",
				"Kumar Balambeed");
		findByEmpName.stream().forEach(e -> System.out.println(e));
	}

	public void findByEmpDepAndEmpGendAndEmpNameAndEmpSal() {
		System.out.println("findByEmpDepAndEmpGendAndEmpNameAndEmpSal()");
		List<Employee> findByEmpName = this.empRepo.findByEmpDepAndEmpGenAndEmpNameAndEmpSal("Developer", "Male",
				"Kumar Balambeed", 100000.00);
		findByEmpName.stream().forEach(e -> System.out.println(e));
	}

	public void findByEmpSalGreaterThanEqual() {
		System.out.println("findByEmpSalGreaterThanEqual()");
		List<Employee> findByEmpName = this.empRepo.findByEmpSalGreaterThanEqual(100000.00);
		findByEmpName.stream().forEach(e -> System.out.println(e));
	}

	public void findAllCustomQuerySql() {
		System.out.println("findAllCustomQuerySql()");
		List<Employee> findAllCustomQuerySql = this.empRepo.findAllCustomQuerySql();
		for (Employee employee : findAllCustomQuerySql) {
			System.out.println(employee);
		}
	}

	public void findAllCustomQueryHql() {
		System.out.println("findAllCustomQueryHql");
		List<Employee> findAllCustomQuerySql = this.empRepo.findAllCustomQueryHql();
		for (Employee employee : findAllCustomQuerySql) {
			System.out.println(employee);
		}

	}

	public void findByEmpNameCustomQueryHql() {
		System.out.println("findByEmpNameCustomQueryHql");
		Employee employee = this.empRepo.findByEmpNameCustomQueryHql("Kumar Balambeed");

		System.out.println(employee);

	}

	public void findByEmpGenCustomQueryHql() {
		System.out.println("findByEmpGenCustomQueryHql");
		List<Object> findByEmpNameCustomQueryHql = this.empRepo.findByEmpGenCustomQueryHql("Male");
		for (Object employee : findByEmpNameCustomQueryHql) {
			System.out.println(employee);
		}
	}

	public void findByEmpNameCustomQuerySql() {
		System.out.println("findByEmpNameCustomQuerySql");
		List<Employee> findByEmpNameCustomQueryHql = this.empRepo.findByEmpNameCustomQuerySql("Kumar Balambeed");
		for (Employee employee : findByEmpNameCustomQueryHql) {
			System.out.println(employee);
		}
	}

	public void findByEmpGenCustomQuerySql() {
		System.out.println("findByEmpGenCustomQuerySql");
		List<Object> findByEmpNameCustomQueryHql = this.empRepo.findByEmpGenCustomQuerySql("Male");
		for (Object employee : findByEmpNameCustomQueryHql) {
			System.out.println(employee);
		}
	}

	public void customSqlInsert() {
		System.out.println("customSqlInsert");
		this.empRepo.customSqlInsert(2, "Kumar Balambeed", "Male", "Java Developer", 200000.00);

	}

	public void customSqlUpdate() {
		System.out.println("customSqlUpdate");
		this.empRepo.customSqlUpdate(2, "Sunil Balambeed", "Male", "Doctor", 2000000.00);

	}

	public void customSqlDelete() {
		System.out.println("customSqlDelete");
		this.empRepo.customSqlDelete(2);

	}

	public void customHqlInsert() {
		System.out.println("customHqlInsert");
		this.empRepo.customHqlInsert(2, "Kumar Balambeed", "Male", "Java Developer", 200000.00);

	}

	public void customHqlUpdate() {
		System.out.println("customHqlUpdate");
		this.empRepo.customHqlUpdate(2, "Sunil Balambeed", "Male", "Doctor", 2000000.00);

	}

	public void customHqlDelete() {
		System.out.println("customHqlDelete");
		this.empRepo.customHqlDelete(2);

	}

	public void customJpqlInsert() {
		System.out.println("customJpqlInsert");
		int e = this.empRepo.customJpqlInsert(2, "Kumar Balambeed", "Male", "Java Developer", 200000.00);
		System.out.println(e);
	}

	public void customJpqlUpdate() {
		System.out.println("customJpqlUpdate");
		this.empRepo.customJpqlUpdate(2, "Sunil Balambeed", "Male", "Doctor", 2000000.00);

	}

	public void customJpqlDelete() {
		System.out.println("customJpqlDelete");
		this.empRepo.customJpqlDelete(2);

	}

}
