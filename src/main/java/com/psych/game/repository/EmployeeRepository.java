package com.psych.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psych.game.modal.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>  {

}
