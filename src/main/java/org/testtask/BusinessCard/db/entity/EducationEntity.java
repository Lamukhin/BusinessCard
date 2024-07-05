package org.testtask.BusinessCard.db.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "education")
@Getter
@Setter
public class EducationEntity {

    private enum Type {
        COURSE,
        UNIVERSITY
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(name = "name")
    private String name;
    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private Type type;
    @Column(name = "link")
    private String link;
    @Column(name = "study_period")
    private String studyPeriod;

}
