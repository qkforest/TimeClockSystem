package com.group.TimeClockSystem.controller.team;

import com.group.TimeClockSystem.domain.team.Team;
import com.group.TimeClockSystem.dto.team.SaveTeamRequest;
import com.group.TimeClockSystem.dto.team.TeamViewResponse;
import com.group.TimeClockSystem.service.team.TeamService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/team")
public class TeamController {

        private final TeamService teamService;

        public TeamController(TeamService teamService) {
            this.teamService = teamService;
        }

        @GetMapping
        public List<TeamViewResponse> getTeams() {
            return teamService.getAllTeams();
        }

        @PostMapping
        public void saveTeam(@RequestBody SaveTeamRequest request) {
            teamService.saveTeam(request);
    }
}
