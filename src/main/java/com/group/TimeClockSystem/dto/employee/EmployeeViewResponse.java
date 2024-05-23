package com.group.TimeClockSystem.dto.employee;

import com.group.TimeClockSystem.domain.employee.Employee;
import com.group.TimeClockSystem.domain.employee.Role;
import com.group.TimeClockSystem.domain.team.Team;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Builder
@AllArgsConstructor
public class EmployeeViewResponse {
    private String name;
    private String teamName;
    private Role role;
    private LocalDate birthday;
    private LocalDate workStartDate;

    public static EmployeeViewResponse from(Employee employee) {
        return EmployeeViewResponse.builder()
                .name(employee.getName())
                .teamName(employee.getTeam().getName())
                .role(employee.getRole())
                .birthday(employee.getBirthday())
                .workStartDate(employee.getWorkStartDate())
                .build();
    }
}
