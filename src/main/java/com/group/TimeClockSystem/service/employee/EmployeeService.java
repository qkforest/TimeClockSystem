package com.group.TimeClockSystem.service.employee;

import com.group.TimeClockSystem.domain.employee.Employee;
import com.group.TimeClockSystem.domain.employee.Role;
import com.group.TimeClockSystem.domain.team.Team;
import com.group.TimeClockSystem.dto.employee.EmployeeViewResponse;
import com.group.TimeClockSystem.dto.employee.SaveEmployeeRequest;
import com.group.TimeClockSystem.repository.employee.EmployeeRepository;
import com.group.TimeClockSystem.repository.team.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;


@RequiredArgsConstructor
@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final TeamRepository teamRepository;


    @Transactional
    public List<EmployeeViewResponse> getAllEmployees() {
        return employeeRepository.findAll().stream()
                .map(EmployeeViewResponse::from)
                .collect(Collectors.toList());
    }

    @Transactional
    public void saveEmployee(SaveEmployeeRequest request) {
        Team team = teamRepository.findByName(request.getTeamName()).orElseThrow(() ->
                new IllegalArgumentException("존재하지 않는 팀입니다"));
        Employee employee = request.toEntity();

        employee.registerTeam(team);
        team.increaseEmployeeCount();
        if (employee.getRole().equals(Role.MANAGER)) {
            team.registerManager(employee.getName());

        }
        employeeRepository.save(employee);
    }

}
