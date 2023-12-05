package net.pe.eivicorp.cl3_chiclla_jean.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProductoExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseBody
    public String handleIllegalArgumentException(IllegalArgumentException e) {
        return e.getMessage();
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String handleException(Exception e) {
        return e.getMessage();
    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public String handleRuntimeException(RuntimeException e) {
        return e.getMessage();
    }

    @ExceptionHandler(Throwable.class)
    @ResponseBody
    public String handleThrowable(Throwable e) {
        return e.getMessage();
    }

    @ExceptionHandler(Error.class)
    @ResponseBody
    public String handleError(Error e) {
        return e.getMessage();
    }

    @ExceptionHandler(NullPointerException.class)
    @ResponseBody
    public String handleNullPointerException(NullPointerException e) {
        return e.getMessage();
    }


}
