package com.theblack.laquinielamx.controllers;

import com.theblack.laquinielamx.models.Team;
import com.theblack.laquinielamx.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Victor Hugo Olvera Cruz
 */
@RestController
public class TeamController {

    @Autowired
    TeamService teamService;


    /**
     * Get a specific Team based on his id
     * */
    @GetMapping("/team/{idTeam}")
    public Team getTeam(@PathVariable Long idTeam){
        Team result = teamService.getTeambyId(idTeam);
        return result;
    }
}
