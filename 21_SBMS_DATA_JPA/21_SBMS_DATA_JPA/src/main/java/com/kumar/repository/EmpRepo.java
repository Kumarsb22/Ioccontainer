package com.kumar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kumar.entity.Employee;

@Repository
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

	@Query("From Employee")
	List<Employee> findAllCustomQueryHql();

	@Query("From Employee Where empName=:empName")
	Employee findByEmpNameCustomQueryHql(@Param("empName") String empName);

	@Query("Select empName,empSal From Employee Where empGen=:empGen")
	List<Object> findByEmpGenCustomQueryHql(@Param("empGen") String empGen);

	@Query(value = "Select * From employee where emp_name=:empName", nativeQuery = true)
	List<Employee> findByEmpNameCustomQuerySql(@Param("empName") String empName);

	@Query(value = "Select * From employee", nativeQuery = true)
	List<Employee> findAllCustomQuerySql();

	@Query(value = "Select emp_name,emp_gen,emp_sal From employee Where emp_gen=:empGen", nativeQuery = true)
	List<Object> findByEmpGenCustomQuerySql(@Param("empGen") String empGen);

	@Transactional
	@Modifying
	@Query(value = "INSERT INTO employee(emp_id,emp_name,emp_gen,emp_dep,emp_sal) VALUES(?1,?2,?3,?4,?5)", nativeQuery = true)
	void customSqlInsert(Integer empId, String empName, String empGen, String empDep, Double empSal);

	@Transactional
	@Modifying
	@Query(value = "UPDATE employee SET emp_name=?2,emp_gen=?3,emp_dep=?4,emp_sal=?5 WHERE emp_id=?1", nativeQuery = true)
	void customSqlUpdate(Integer empId, String empName, String empGen, String empDep, Double empSal);

	@Transactional
	@Modifying
	@Query(value = "DELETE FROM employee WHERE emp_id=?1", nativeQuery = true)
	void customSqlDelete(Integer empId);

	@Transactional
	@Modifying
	@Query("INSERT INTO Employee(empId,empName,empGen,empDep,empSal) VALUES(?1,?2,?3,?4,?5)")
	void customHqlInsert(Integer empId, String empName, String empGen, String empDep, Double empSal);

	@Transactional
	@Modifying
	@Query("UPDATE Employee SET empName=?2, empGen=?3, empDep=?4,empSal=?5 WHERE empId=?1")
	void customHqlUpdate(Integer empId, String empName, String empGen, String empDep, Double empSal);

	@Transactional
	@Modifying
	@Query("DELETE FROM Employee WHERE empId=?1")
	public void customHqlDelete(Integer empId);

	@Transactional
	@Modifying
	@Query("INSERT INTO Employee(empId,empName,empGen,empDep,empSal) VALUES(?1,?2,?3,?4,?5)")
	public int customJpqlInsert(Integer empId, String empName, String empGen, String empDep, Double empSal);

	@Transactional
	@Modifying
	@Query("UPDATE Employee e SET e.empName=?2,e.empGen=?3,e.empDep=?4,e.empSal=?5 WHERE e.empId=?1")
	public void customJpqlUpdate(Integer empId, String empName, String empGen, String empDep, Double empSal);

	@Transactional
	@Modifying
	@Query("DELETE FROM Employee e WHERE e.empId=?1")
	public void customJpqlDelete(Integer empId);
}
