package com.theblack.laquinielamx.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Victor Hugo Olvera Cruz
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) //To avoid Exception by Serialization
@Entity
@Table(name = "user_matches")
public class UserMatches implements Serializable {

    //Attributes
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User userId;

    @Column(name = "local_team_score", nullable = false)
    private Integer localTeamScore;

    @Column(name = "away_team_score", nullable = false)
    private Integer awayTeamScore;

    @Column(name = "round", nullable = false)
    private Integer round;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "stadium_id")
    private Stadium stadium;

    @Column(name = "match_day", nullable = false)
    private LocalDateTime matchDay;

    @Column(name = "status")
    private String status;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "local_team_id")
    private Team localTeam;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "away_team_id")
    private Team awayTeam;


}