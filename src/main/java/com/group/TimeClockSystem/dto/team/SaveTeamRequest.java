package com.group.TimeClockSystem.dto.team;

import com.group.TimeClockSystem.domain.team.Team;
import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SaveTeamRequest {
    private String name;

    public Team toEntity() {
        return Team.builder()
                .name(name)
                .build();
    }
}
