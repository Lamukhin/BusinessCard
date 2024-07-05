package org.testtask.BusinessCard.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PrivateInformationController {

    @GetMapping("/")
    public ResponseEntity<String> getAuthorInfo() {
        return null;
    }
}
