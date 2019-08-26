package com.theblack.laquinielamx.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * @author Victor Hugo Olvera Cruz
 */
@Data
@Entity(name = "matches")
public class Matches {

    //Attributes
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    //TODO: Relation many Matches to one ID ???
    @Column(name = "id_local_team", nullable = false)
    private Long idLocalTeamName;

    //TODO: Relation many Matches to one ID  ???
    @Column(name = "id_away_team", nullable = false)
    private Long idAwayTeamName;

    @Column(name = "name_local_team", nullable = false)
    private String localTeamName;

    @Column(name = "name_away_team", nullable = false)
    private String awayTeamName;

    @Column(name = "local_team_score",nullable = false)
    private Integer localTeamScore;

    @Column(name = "away_team_score", nullable = false)
    private Integer awayTeamScore;

    @Column(name = "round", nullable = false)
    private Integer round;

    @Column(name = "stadium", nullable = false)
    private String stadium;

    @Column(name = "match_day", nullable = false)
    private LocalDateTime matchDay;

    @Column(name = "status", nullable = true)
    private String status;


}
