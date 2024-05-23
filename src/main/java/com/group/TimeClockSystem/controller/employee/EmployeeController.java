package com.group.TimeClockSystem.controller.employee;

import com.group.TimeClockSystem.dto.employee.EmployeeViewResponse;
import com.group.TimeClockSystem.dto.employee.SaveEmployeeRequest;
import com.group.TimeClockSystem.service.employee.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<EmployeeViewResponse> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @PostMapping
    public void saveEmployee(@RequestBody SaveEmployeeRequest request) {
        employeeService.saveEmployee(request);
    }
}
