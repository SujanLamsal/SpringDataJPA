package com.employeeapp;

import java.util.Optional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.employeeapp.configuration.DBConfig;
import com.employeeapp.model.Employee;
import com.employeeapp.service.EmployeeService;



public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
		
//		EmployeeRepository repository = context.getBean(EmployeeRepository.class);
		EmployeeService service = context.getBean(EmployeeService.class);
		
		
		Employee employee = new Employee();
		employee.setId((long)0);
		employee.setAge(21);
		employee.setDepartmentId((long)1);
		employee.setName("Sailesh");
		employee.setOrganizationId((long)(5));
		employee.setPosition("Peon");
		
//		service.addEmployee(employee);
//		System.out.println(service.deleteEmployee(5));
		
		System.out.println(service.findByOrganizationId(5).toString());
		
		context.close();
		
	}

}
