package com.kumar.service;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.kumar.Employee;
import com.kumar.repo.EmpRepo;

@Service
public class EmpService {
	private EmpRepo empRepo;

	public EmpService(EmpRepo empRepo) {
		this.empRepo = empRepo;
	}

	public void sortEmp(String colom, String order) {
		Sort sort = null;
		if (order.equals("A")) {
			sort = Sort.by(colom);
		} else if (order.equals("D")) {
			sort = Sort.by(colom).descending();
		}
		this.empRepo.findAll(sort).forEach(e -> System.out.println(e));
	}

	public void qbeEmp(Employee employee) {
		Example<Employee> of = Example.of(employee);
		this.empRepo.findAll(of).forEach(e -> System.out.println(e));
	}

	public void paginationEmp(Integer pageNo, Integer pageSize) {
		PageRequest of = PageRequest.of(pageNo, pageSize);
		Page<Employee> findAll = this.empRepo.findAll(of);
		findAll.getContent().forEach(e -> System.out.println(e));
	}
}
