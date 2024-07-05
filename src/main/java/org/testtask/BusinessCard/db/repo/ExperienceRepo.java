package org.testtask.BusinessCard.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.testtask.BusinessCard.db.entity.EducationEntity;
import org.testtask.BusinessCard.db.entity.ExperienceEntity;

import java.util.UUID;

public interface ExperienceRepo extends JpaRepository<ExperienceEntity, UUID> {
}
