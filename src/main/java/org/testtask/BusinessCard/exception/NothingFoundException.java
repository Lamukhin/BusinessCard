package org.testtask.BusinessCard.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class NothingFoundException extends RuntimeException {

    private final String messageForUser;
}