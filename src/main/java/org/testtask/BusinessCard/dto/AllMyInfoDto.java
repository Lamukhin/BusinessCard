package org.testtask.BusinessCard.dto;

import java.util.List;

public record AllMyInfoDto(
    String name,
    String dateOfBirth,
    String phoneNumber,
    String email,
    String about,
    List<FullContactDto> additionalContacts,
    String base64Photo
) {
}
