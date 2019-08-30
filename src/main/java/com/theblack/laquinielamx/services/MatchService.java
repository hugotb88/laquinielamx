package com.theblack.laquinielamx.services;

import com.theblack.laquinielamx.daos.MatchesDao;
import com.theblack.laquinielamx.models.Match;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Victor Hugo Olvera
 * Match Service
 * */
@Service
public class MatchService {

    @Autowired
    MatchesDao matchesDao;

    /**
     * Get all the matches in the Matches Table
     * */
    public List<Match> getAllMatchesOfSeason(){
        return matchesDao.findAll();
    }
}
