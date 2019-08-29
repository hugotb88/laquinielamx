package com.theblack.laquinielamx.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author Victor Hugo Olvera Cruz
 */
@Data
@Entity
@Table(name = "stadiums")
public class Stadium implements Serializable {

    //Atttributes
    @Id
    @Column
    private Long id;

    @Column (name = "name", nullable = false)
    private String stadiumName;


}
