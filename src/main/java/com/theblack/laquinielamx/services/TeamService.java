package com.theblack.laquinielamx.services;

import com.theblack.laquinielamx.daos.TeamDao;
import com.theblack.laquinielamx.models.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Victor Hugo Olvera
 * Team Service
 */
@Service
public class TeamService {
    @Autowired
    TeamDao teamDao;

    /**
     * Get a Team object based using his id
     * */
    public Team getTeambyId(Long idTeam) {
        return teamDao.getOne(idTeam);
    }
}
