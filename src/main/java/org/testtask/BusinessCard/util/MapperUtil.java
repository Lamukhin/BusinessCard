package org.testtask.BusinessCard.util;

import org.testtask.BusinessCard.db.entity.CommonInfoEntity;
import org.testtask.BusinessCard.db.entity.FullContactsEntity;
import org.testtask.BusinessCard.dto.AllMyInfoDto;
import org.testtask.BusinessCard.dto.FullContactDto;

import java.util.ArrayList;
import java.util.List;

public class MapperUtil {

    public static AllMyInfoDto mapInfoEntitiesToDto(
            CommonInfoEntity commonInfoEntity,
            List<FullContactsEntity> contacts,
            String photoBased64){

        return new AllMyInfoDto(
                commonInfoEntity.getName(),
                commonInfoEntity.getDateOfBirth(),
                commonInfoEntity.getPhoneNumber(),
                commonInfoEntity.getEmail(),
                commonInfoEntity.getAbout(),
                mapContactsToDto(contacts),
                photoBased64
        );
    }

    public static List<FullContactDto> mapContactsToDto (List<FullContactsEntity> contacts){
        List<FullContactDto> contactsList = new ArrayList<>();
        contacts.forEach((e) -> {
            contactsList.add(new FullContactDto(
                    e.getNameOfNetwork(),
                    e.getLink(),
                    e.getContact()
            ));
        });
        return contactsList;
    }

}
