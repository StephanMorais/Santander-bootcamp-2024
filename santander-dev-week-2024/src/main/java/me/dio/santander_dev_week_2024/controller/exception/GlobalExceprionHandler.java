package me.dio.santander_dev_week_2024.controller.exception;

import java.util.NoSuchElementException;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import ch.qos.logback.classic.Logger;

@RestControllerAdvice
public class GlobalExceprionHandler {
	
	private final Logger logger = LoggerFactory.getLogger(GlobalExceptionHnadler.class);
	

	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<String>handle(IllegalArgumentException businessException){
		return new ResponseEntity<>(businessException.getMessage(),HttpStatus.UNPROCESSABLE_ENTITY);
	}
	
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String>handle(NoSuchElementException notFoundException){
		return new ResponseEntity<>("Ressource ID not found.", HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Throwable.class)
	public ResponseEntity<String>handleUnexpectedException(Throwable unexpectedException){
		var message="Unexpected server error, see the logs.";
		logger.error("", unexpectedException);
		return new ResponseEntity<>(message, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
