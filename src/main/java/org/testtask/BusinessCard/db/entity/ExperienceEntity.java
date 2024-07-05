package org.testtask.BusinessCard.db.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "experience")
@Getter
@Setter
public class ExperienceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(name = "company_name")
    private String companyName;
    @Column(name = "work_period")
    private String workPeriod;
    @Column(name = "job_duties")
    private String jobDuties;
    @Column(name = "achievements")
    private String achievements;
}
