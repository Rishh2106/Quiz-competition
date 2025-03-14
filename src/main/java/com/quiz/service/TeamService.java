package com.quiz.service;

import com.quiz.model.Team;
import com.quiz.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public void createTeam(String name, String uniqueId, String password) {
        Team team = new Team();
        team.setName(name);
        team.setUniqueId(uniqueId);
        team.setPassword(password);
        teamRepository.save(team);
    }
}
