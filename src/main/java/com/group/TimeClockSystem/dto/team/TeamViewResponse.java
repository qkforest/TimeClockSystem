package com.group.TimeClockSystem.dto.team;

import com.group.TimeClockSystem.domain.team.Team;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class TeamViewResponse {
    private String name;
    private String manager;
    private int memberCount;

    public static TeamViewResponse from(Team team) {
        return TeamViewResponse.builder()
                .name(team.getName())
                .manager(team.getManager())
                .memberCount(team.getEmployeeCount())
                .build();
    }
}
