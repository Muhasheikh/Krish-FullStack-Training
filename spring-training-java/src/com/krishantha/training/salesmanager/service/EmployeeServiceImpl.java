package com.krishantha.training.salesmanager.service;

import com.krishantha.training.salesmanager.model.Employee;
import com.krishantha.training.salesmanager.repository.EmployeeRepository;
import com.krishantha.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class EmployeeServiceImpl implements EmployeeService {

	  private EmployeeRepository employeeRepository;

	    public EmployeeServiceImpl() {
	        System.out.println("default constructor executed!");
	    }

	    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
	        System.out.println("overload constructor executed!");
	        this.employeeRepository = employeeRepository;
	    }

	 
//	    @Autowired
	    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
	        System.out.println("setter executed!");
	        this.employeeRepository = employeeRepository;
	    }

	    
	    public EmployeeRepository getEmployeeRepository() {
	        return employeeRepository;
	    }

	    @Override
	    public List<Employee> getAllEmployees() {
	        return employeeRepository.getAllEmployees();
    }
}
