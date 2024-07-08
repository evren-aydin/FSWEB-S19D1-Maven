package com.workintech.s18d2.validations;

import com.workintech.s18d2.exceptions.FruitAndVegetableException;
import org.springframework.http.HttpStatus;

public class Validation {

    //Magic String
    private static final String ID_IS_NOT_VALID = "Id can not less than 0";

    public static void isIdNotValid(long id) {
        if (id < 0) {
            throw new FruitAndVegetableException(ID_IS_NOT_VALID, HttpStatus.BAD_REQUEST);
        }
    }
}
