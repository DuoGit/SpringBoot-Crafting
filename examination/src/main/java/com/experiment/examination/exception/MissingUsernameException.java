package com.experiment.examination.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class MissingUsernameException extends RuntimeException {

    public MissingUsernameException(String message) {
        super(message);
    }
}
