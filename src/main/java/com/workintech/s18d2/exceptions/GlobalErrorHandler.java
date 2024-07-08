package com.workintech.s18d2.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalErrorHandler {


    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleException (FruitAndVegetableException fruitAndVegetableException){
        ErrorResponse errorResponse = new ErrorResponse(fruitAndVegetableException.getMessage());
        return new ResponseEntity<>(errorResponse,fruitAndVegetableException.getHttpStatus());
    }

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleException (Exception exception){
        ErrorResponse errorResponse = new ErrorResponse(exception.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }
    //Entity classlarında yazdığımız validasyonlara uyulmadığında hata fırlatacaklar
    //Burada yazdığımız exception error handler da hataları yakalayıp bize dönecek
}
