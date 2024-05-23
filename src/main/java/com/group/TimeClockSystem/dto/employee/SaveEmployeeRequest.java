package com.group.TimeClockSystem.dto.employee;

import com.group.TimeClockSystem.domain.employee.Employee;
import com.group.TimeClockSystem.domain.employee.Role;
import lombok.*;

import java.time.LocalDate;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SaveEmployeeRequest {
    private String name;

    private String teamName;

    private Role role;

    private LocalDate birthday;

    private LocalDate workStartDate;

    public Employee toEntity() {
        return Employee.builder()
                .name(name)
                .role(role)
                .birthday(birthday)
                .workStartDate(workStartDate)
                .build();
    }
}
