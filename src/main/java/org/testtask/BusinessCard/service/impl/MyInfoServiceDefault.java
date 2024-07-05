package org.testtask.BusinessCard.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.testtask.BusinessCard.db.entity.CommonInfoEntity;
import org.testtask.BusinessCard.db.entity.FullContactsEntity;
import org.testtask.BusinessCard.db.repo.CommonInfoRepo;
import org.testtask.BusinessCard.db.repo.FullContactsRepo;
import org.testtask.BusinessCard.dto.AllMyInfoDto;
import org.testtask.BusinessCard.exception.NothingFoundException;
import org.testtask.BusinessCard.service.interfaces.MyInfoService;
import org.testtask.BusinessCard.util.MapperUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class MyInfoServiceDefault implements MyInfoService {

    private final CommonInfoRepo commonInfoRepo;
    private final FullContactsRepo fullContactsRepo;
    private final ObjectMapper objectMapper;

    @Override
    public String getMyFullInfo() {
        List<CommonInfoEntity> commonInfo = commonInfoRepo.findAll();
        if (commonInfo.isEmpty()) {
            throw new NothingFoundException("Общая информация не была ещё добавлена. Авторизуйтесь и внесите её.");
        }
        String base64Photo = null;
        if (commonInfo.get(0).getPhotoUrl() != null) {
            try {
                base64Photo = Base64.getEncoder().encodeToString(Files.readAllBytes((Paths.get("src/main/resources/static/my_photo.jpg"))));
            } catch (IOException ex) {
                String errorMessage = "Не удалось преобразовать картинку в base64!";
                log.error(errorMessage + "{}", ex.getMessage());
                throw new RuntimeException(errorMessage, ex);
            }
        }
        List<FullContactsEntity> allContacts = fullContactsRepo.findAll();

        AllMyInfoDto allMyInfoDto = MapperUtil.mapInfoEntitiesToDto(commonInfo.get(0), allContacts, base64Photo);
        String finalJson;
        try {
            finalJson = objectMapper.writeValueAsString(allMyInfoDto);
        } catch (IOException ex) {
            String errorMessage = "Не удалось преобразовать объект AllMyInfoDto в String!";
            log.error(errorMessage + "{}", ex.getMessage());
            throw new RuntimeException(errorMessage, ex);
        }
        return finalJson;
    }
}
