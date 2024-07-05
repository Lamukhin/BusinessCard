package org.testtask.BusinessCard.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.testtask.BusinessCard.db.entity.CommonInfoEntity;
import org.testtask.BusinessCard.db.entity.EducationEntity;

import java.util.UUID;

public interface EducationRepo extends JpaRepository<EducationEntity, UUID> {
}
