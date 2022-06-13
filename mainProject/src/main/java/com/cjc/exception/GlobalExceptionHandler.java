package com.cjc.exception;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

	@ExceptionHandler(DealerRegistrationIdNotFoundException.class)
	public  ResponseEntity<ErrorResponse> DealerRegistrationIdNotFoundExceptionHandler(DealerRegistrationIdNotFoundException d,HttpServletRequest request)
	{
		log.info("call DealerRegistrationIdNotFoundException");
		
		ErrorResponse error=new ErrorResponse(HttpStatus.NOT_FOUND.value(),HttpStatus.NOT_FOUND,d.getMessage(),new Date(),request.getRequestURI());
		
		return  new ResponseEntity<ErrorResponse>(error,HttpStatus.NOT_FOUND);
	}
}
