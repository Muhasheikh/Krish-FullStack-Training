package com.krishantha.training.salesmanager;

import com.krishantha.training.salesmanager.repository.EmployeeRepository;
import com.krishantha.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;
import com.krishantha.training.salesmanager.service.EmployeeService;
import com.krishantha.training.salesmanager.service.EmployeeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;


@Configuration
@ComponentScan("com.Krishantha")
@PropertySource("application.properties")
public class ApplicationConfiguration {

	  @Bean(name = "employeeService")
//    @Scope("singleton")
//    @Scope("prototype")
    EmployeeService getEmployeeService(){
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        employeeService.setEmployeeRepository(getEmployeeRepository());
        return employeeService;
    }

    @Bean(name = "employeeRepository")
    EmployeeRepository getEmployeeRepository(){
        return new HibernateEmployeeRepositoryImpl();
    }
    
    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
    	
    	return new PropertySourcesPlaceholderConfigurer();
    }

}
