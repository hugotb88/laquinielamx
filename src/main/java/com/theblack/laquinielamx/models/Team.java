package com.theblack.laquinielamx.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Victor Hugo Olvera Cruz
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) //To avoid Exception by Serialization
@Entity
@Table(name = "teams")
public class Team implements Serializable {

    //Attributes
    @Id
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "team_name", nullable = false)
    private String teamName;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = " stadium_id")
    private Stadium stadium;

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
