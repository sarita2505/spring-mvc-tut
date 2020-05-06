package com.spring.conttroller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.IOException;

@ControllerAdvice
public class ExceptionHandlerClass {
    @ExceptionHandler(value = NullPointerException.class)
    public String exceptionHandler(Exception e){
        System.out.println("NullpointerException occured"+e);
        return "viewpage/nullpointerExcept";
    }
@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = IOException.class)
    public String exceptionHandler1(Exception e){
        System.out.println("IoException occured"+e);
        return "viewpage/ioexception";
    }
    @ExceptionHandler(value = Exception.class)
    public String exceptionHandler2(Exception e){
        System.out.println("Exception occured"+e);
        return "viewpage/exception";
    }

}
