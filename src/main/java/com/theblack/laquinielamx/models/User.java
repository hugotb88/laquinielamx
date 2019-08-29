package com.theblack.laquinielamx.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "users")
public class User {

    //Attributes
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String userName;

    @Column(name = "email")
    private String email;

    @Column(name = "fb_id")
    private String fbId;

    @Column(name = "profile_picture")
    private String profilePicture;

    @Column(name = "points")
    private Integer points;

    @Column(name = "status")
    private String status;



}

