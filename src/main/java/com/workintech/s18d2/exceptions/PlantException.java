package com.workintech.s18d2.exceptions;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class PlantException extends RuntimeException{

    private HttpStatus httpStatus;

    public PlantException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }
}
