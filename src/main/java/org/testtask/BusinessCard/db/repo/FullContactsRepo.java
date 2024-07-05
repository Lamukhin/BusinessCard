package org.testtask.BusinessCard.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.testtask.BusinessCard.db.entity.FullContactsEntity;
import org.testtask.BusinessCard.db.entity.HobbyEntity;

import java.util.UUID;

public interface FullContactsRepo extends JpaRepository<FullContactsEntity, UUID> {
}
