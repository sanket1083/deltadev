
package com.cjc.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ErrorResponse {

	private int status;
	private HttpStatus error;
	private String message;
	private Date  tiDate;
	private String path;
}
