package org.testtask.BusinessCard.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.testtask.BusinessCard.db.entity.CommonInfoEntity;
import org.testtask.BusinessCard.db.entity.FullContactsEntity;
import org.testtask.BusinessCard.db.repo.CommonInfoRepo;
import org.testtask.BusinessCard.db.repo.FullContactsRepo;
import org.testtask.BusinessCard.service.interfaces.MyInfoService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MyInfoServiceDefault implements MyInfoService {

    private final CommonInfoRepo commonInfoRepo;
    private final FullContactsRepo fullContactsRepo;
    private final ObjectMapper objectMapper;

    @Override
    public String getMyFullInfo() {
        List<CommonInfoEntity> commonInfo = commonInfoRepo.findAll();
        if(commonInfo.isEmpty()) {
            throw new RuntimeException("Общая информация не была добавлена. Авторизуйтесь и внесите её.");
        }

        if (commonInfo.get(0).getPhotoUrl() != null){
            //TODO
        }
        List<FullContactsEntity> allContacts = fullContactsRepo.findAll();
        return null;
    }
}
