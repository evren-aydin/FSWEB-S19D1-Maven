package com.workintech.s18d2.exceptions;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class FruitAndVegetableException extends RuntimeException{

    private HttpStatus httpStatus;

    public FruitAndVegetableException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }
}
