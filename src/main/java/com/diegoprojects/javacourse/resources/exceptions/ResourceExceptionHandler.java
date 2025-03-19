package com.diegoprojects.javacourse.resources.exceptions;

import com.diegoprojects.javacourse.services.exceptions.ResourceNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler extends RuntimeException {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandartError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request) {
      String error = "Resource not found";
      HttpStatus status = HttpStatus.NOT_FOUND;
      StandartError err = new StandartError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
      return ResponseEntity.status(status).body(err);
    }
}
