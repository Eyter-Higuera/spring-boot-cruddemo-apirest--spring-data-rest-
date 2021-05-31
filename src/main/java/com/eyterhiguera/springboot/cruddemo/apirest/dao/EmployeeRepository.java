package com.eyterhiguera.springboot.cruddemo.apirest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.eyterhiguera.springboot.cruddemo.apirest.entity.Employee;

//Spring Data Jpa (JpaRepository)
//@RepositoryRestResource(path="members")
//http://localhost:8090/magic-api/members
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	//that's it....no need to write any code
}
