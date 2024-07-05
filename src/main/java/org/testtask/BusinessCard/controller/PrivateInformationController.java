package org.testtask.BusinessCard.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.testtask.BusinessCard.db.entity.CommonInfoEntity;
import org.testtask.BusinessCard.db.entity.FullContactsEntity;
import org.testtask.BusinessCard.db.repo.CommonInfoRepo;
import org.testtask.BusinessCard.db.repo.FullContactsRepo;

import java.io.File;
import java.util.List;


@Controller
@RequiredArgsConstructor
public class PrivateInformationController {

    @GetMapping("/")
    public ResponseEntity<String> getMyInfo() {
        //TODO
        return null;
    }

}
