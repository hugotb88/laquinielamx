package com.theblack.laquinielamx.models;

import lombok.Data;

import javax.persistence.*;
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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "local_team_id", referencedColumnName = "id")
    private Team localTeam;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "away_team_id", referencedColumnName = "id")
    private Team awayTeam;

    @Column(name = "local_team_score",nullable = false)
    private Integer localTeamScore;

    @Column(name = "away_team_score", nullable = false)
    private Integer awayTeamScore;

    @Column(name = "round", nullable = false)
    private Integer round;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "stadium_id", referencedColumnName = "id")
    private Stadium stadium;

    @Column(name = "match_day", nullable = false)
    private LocalDateTime matchDay;

    @Column(name = "status", nullable = true)
    private String status;


}
