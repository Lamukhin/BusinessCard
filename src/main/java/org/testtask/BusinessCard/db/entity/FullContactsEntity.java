package org.testtask.BusinessCard.db.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "full_contacts")
@Getter
@Setter
public class FullContactsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(name = "name_of_network")
    private String nameOfNetwork;
    @Column(name = "link")
    private String link;
    @Column(name = "contact")
    private String contact;
}
