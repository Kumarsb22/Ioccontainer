package com.kumar.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kumar.entity.Employee;

//@Repository
public interface EmpRepo extends CrudRepository<Employee, Integer> {

	List<Employee> findByEmpName(String empName);

	List<Employee> findByEmpGen(String string);

	List<Employee> findByEmpDep(String string);

	List<Employee> findByEmpSal(double d);

	List<Employee> findByEmpDepAndEmpGen(String string, String string2);

	List<Employee> findByEmpSalAndEmpName(double d, String string);

	List<Employee> findByEmpDepAndEmpGenAndEmpName(String string, String string2, String string3);


	List<Employee> findByEmpDepAndEmpGenAndEmpNameAndEmpSal(String string, String string2, String string3, double d);

	List<Employee> findByEmpSalGreaterThanEqual(double d);

}
