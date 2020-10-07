package vkhanhqui.myblog.controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerAdvisor {

    @ExceptionHandler(value = Exception.class)
    public String defaultErrorHandler() {
        return "notfound";
    }
}