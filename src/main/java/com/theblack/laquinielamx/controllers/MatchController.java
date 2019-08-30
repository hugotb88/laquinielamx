package com.theblack.laquinielamx.controllers;

import com.theblack.laquinielamx.models.Match;
import com.theblack.laquinielamx.services.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Victor Hugo Olvera Cruz
 */
@RestController
public class MatchController {

    @Autowired
    MatchService matchService;

    /**
     * Get a List of all the matches of the season
     * */
    @GetMapping("/matches")
    public ResponseEntity<List> getAllMatches(){
        List<Match> result =  matchService.getAllMatchesOfSeason();
        return new ResponseEntity<List>( result, HttpStatus.OK);
    }

//    @GetMapping("/matches/{idMatch}")
//    public Match getMatch (@PathVariable Long idMatch){
//        Match result = new Match();
//        result = matchesDao.getOne(idMatch);
//        return result;
//    }
}
