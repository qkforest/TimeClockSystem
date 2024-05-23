package com.group.TimeClockSystem.repository.employee;

import com.group.TimeClockSystem.domain.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}