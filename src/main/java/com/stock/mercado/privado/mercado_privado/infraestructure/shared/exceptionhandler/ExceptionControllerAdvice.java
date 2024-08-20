package com.stock.mercado.privado.mercado_privado.infraestructure.shared.exceptionhandler;

import com.stock.mercado.privado.mercado_privado.domain.shared.exception.gobalexception.AlreadyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Collections;
import java.util.Map;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    private static final String MESSAGE = "Message";

    @ExceptionHandler(AlreadyException.class)
    public ResponseEntity<Map<String, String>> alreadyException(AlreadyException alreadyException){
        return ResponseEntity.status(HttpStatus.CONFLICT).body(Collections.singletonMap(MESSAGE, alreadyException.getMessage()));
    }

}
