package com.group.TimeClockSystem.service.team;

import com.group.TimeClockSystem.dto.team.TeamViewResponse;
import com.group.TimeClockSystem.domain.team.Team;
import com.group.TimeClockSystem.dto.team.SaveTeamRequest;
import com.group.TimeClockSystem.repository.team.TeamRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class TeamService {

        private final TeamRepository teamRepository;

        @Transactional(readOnly = true)
        public List<TeamViewResponse> getAllTeams() {
            return teamRepository.findAll().stream()
                    .map(TeamViewResponse::from)
                    .collect(Collectors.toList());
        }

        @Transactional
        public  void saveTeam(SaveTeamRequest request) {
                Team team = request.toEntity();
                teamRepository.save(team);
        }
}
