package com.employeeapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeeapp.model.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

//	String addEmployee(Employee employee);
//	String updateEmployee (long id);
//	String deleteEmployee (long id);
//	Optional<Employee> findById(long id);
//	Optional<List<Employee>> getEmployees();
//	Optional<List<Employee>> findByOrganizationId(long id);\
	List<Employee> getByOrganizationId(long id);
	
}
