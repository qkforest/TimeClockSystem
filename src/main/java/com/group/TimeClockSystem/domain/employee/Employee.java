package com.group.TimeClockSystem.domain.employee;

import com.group.TimeClockSystem.domain.team.Team;
import jakarta.persistence.*;
import lombok.*;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @ManyToOne
    @JoinColumn(nullable = false, name = "team_id")
    private Team team;
    @Enumerated(EnumType.STRING)
    private Role role;
    private LocalDate birthday;
    private LocalDate workStartDate;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Team getTeam() {
        return team;
    }

    public Role getRole() {
        return role;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public LocalDate getWorkStartDate() {
        return workStartDate;
    }

    public void registerTeam(Team team) {
        this.team = team;
    }

}
