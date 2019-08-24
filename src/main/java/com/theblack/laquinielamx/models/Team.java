package com.theblack.laquinielamx.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Victor Hugo Olvera Cruz
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "teams")
public class Team {

    //Attributes
    @Id
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "team_name", nullable = false)
    private String teamName;

    @Column(name = "stadium_name", nullable = false)
    private String stadiumName;

    @Column(name = "matches_played")
    private Integer matchesPlayed;

    @Column(name = "matches_won")
    private Integer matchesWon;

    @Column(name = "matches_draw")
    private Integer matchesDraw;

    @Column(name = "matches_lost")
    private Integer matchesLost;

    @Column(name = "goals_scored")
    private Integer goalsScored;

    @Column(name = "goals_against")
    private Integer goalsAgainst;

    @Column(name = "points")
    private Integer points;

}
