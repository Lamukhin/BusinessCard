package org.testtask.BusinessCard.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.testtask.BusinessCard.exception.NothingFoundException;
import org.testtask.BusinessCard.service.interfaces.MyInfoService;

@Controller
@RequiredArgsConstructor
public class PrivateInformationController {

    private final MyInfoService myInfoService;

    @GetMapping("/")
    public ResponseEntity<String> getMyInfo() {
        ResponseEntity<String> response;
        try {
            response = ResponseEntity.ok(myInfoService.getMyFullInfo());
        } catch (NothingFoundException ex){
            return new ResponseEntity<>(ex.getMessageForUser(), HttpStatus.BAD_REQUEST);
        } catch (RuntimeException ex){
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return response;
    }


}
