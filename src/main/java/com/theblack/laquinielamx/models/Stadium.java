package com.theblack.laquinielamx.models;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Victor Hugo Olvera Cruz
 */
@Data
@Entity(name = "stadium")
public class Stadium {

    //Atttributes

    @Id
    @Column
    private Long id;

    @Column (name = "name", nullable = false)
    private String stadiumName;

    @OneToOne(mappedBy = "stadium")
    private Team team;

    @OneToOne(mappedBy = "stadium")
    private Matches match;

}
