package com.netoptc.DsCommerce.handlers;


import com.netoptc.DsCommerce.dtos.ResponseErrorDto;
import com.netoptc.DsCommerce.exceptions.BadRequestException;
import com.netoptc.DsCommerce.exceptions.ResourceNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ResponseErrorDto> handlerResourceNotFound(ResourceNotFoundException e, HttpServletRequest request) {
        HttpStatus status = HttpStatus.NOT_FOUND;
        ResponseErrorDto error = new ResponseErrorDto(Instant.now(), request.getRequestURI(), status.value(), e.getMessage() );
        return ResponseEntity.status(status).body(error);
    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ResponseErrorDto> handlerResourceNotFound(BadRequestException e, HttpServletRequest request) {
        HttpStatus status = HttpStatus.NOT_FOUND;
        ResponseErrorDto error = new ResponseErrorDto(Instant.now(), request.getRequestURI(), status.value(), e.getMessage() );
        return ResponseEntity.status(status).body(error);
    }
}
