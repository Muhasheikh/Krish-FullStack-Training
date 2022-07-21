package com.krishantha.training.salesmanager.repository;

import com.krishantha.training.salesmanager.model.Employee;

import java.util.ArrayList;
import java.util.List;


public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {

    @Override
    public List<Employee> getAllEmployees(){
        List<Employee> employees = new ArrayList<>();

        Employee employee = new Employee();
        employee.setEmployeeName("Abhishek");
        employee.setEmployeeLocation("Negombo");
        employees.add(employee);

        return employees;
    }

}
