package com.krishantha.training.salesmanager.service;

import com.krishantha.training.salesmanager.model.Employee;
import com.krishantha.training.salesmanager.repository.EmployeeRepository;
import com.krishantha.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public EmployeeServiceImpl() {
        System.out.println("Default constructor executed");
    }

//    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        System.out.println("overloaded constructor executed");
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAllEmployees(){
        return employeeRepository.getAllEmployees();
    }


    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
    	System.out.println("Setter injection fired");
        this.employeeRepository = employeeRepository;
    }

    public EmployeeRepository getEmployeeRepository() {
        return employeeRepository;
    }
}
