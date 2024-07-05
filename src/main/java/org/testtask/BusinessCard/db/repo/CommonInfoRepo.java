package org.testtask.BusinessCard.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.testtask.BusinessCard.db.entity.CommonInfoEntity;

import java.util.UUID;

public interface CommonInfoRepo extends JpaRepository<CommonInfoEntity, UUID> {
}
