package org.testtask.BusinessCard.db.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "common_info")
@Getter
@Setter
public class CommonInfoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(name = "name")
    private String name;
    @Column(name = "photo")
    private String photoUrl;
    @Column(name = "date_of_birth")
    private String dateOfBirth;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "email")
    private String email;
    @Column(name = "short_about")
    private String about;

}
