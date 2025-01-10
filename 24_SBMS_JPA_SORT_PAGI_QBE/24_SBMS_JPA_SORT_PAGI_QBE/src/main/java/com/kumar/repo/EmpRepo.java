package com.kumar.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kumar.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
