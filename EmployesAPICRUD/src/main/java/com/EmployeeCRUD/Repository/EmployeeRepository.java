package com.EmployeeCRUD.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EmployeeCRUD.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
