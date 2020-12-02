package com.employeeapp.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeapp.model.Employee;
import com.employeeapp.repository.EmployeeRepository;

@Service

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public String addEmployee(Employee employee) {
		   try {
	             employeeRepository.save(employee);
	            return  "success";
	        } catch (Exception e){
	            e.printStackTrace();
	            return "fail";
	        }
	    }

	
	public String updateEmployee(Employee employee) {
        try {
            employeeRepository.save(employee);
           return  "success";
       } catch (Exception e){
           e.printStackTrace();
           return "fail";
       }
   }

	
	
	public String deleteEmployee(long id) {
		try {
			employeeRepository.deleteById(id);
			return "successfully deleted";
		} catch(Exception e) {
			e.printStackTrace();
			return "failed to delete";
		}
	}

	public Optional<Employee> findById(long id) {
		Optional<Employee> employees = null; 
		
		try{
		employees = employeeRepository.findById(id);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return employees;
	}

	public Optional<List<Employee>> getEmployees() {
		Optional<List<Employee>> employees = null;
		
		try {
		employees = Optional.of(employeeRepository.findAll());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return employees;
	}

	public Optional<List<Employee>> findByOrganizationId(long id) {
		Optional<List<Employee>> employees = null;
		try {
		employees = Optional.of(employeeRepository.getByOrganizationId(id));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return employees;
	}

}
