package com.salam.sdpc.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.salam.sdpc.dto.ResponseError;
import com.salam.sdpc.service.AppointmentService;

public class AppointmentServiceImpl implements AppointmentService{

	@Override
	public ResponseEntity<?> fetchAppointmentSlots(String day) {
		
		try {
			SimpleDateFormat formater = new SimpleDateFormat("dd-mm-yyyy");
			Date slot= formater.parse(day);
			return (ResponseEntity<?>) ResponseEntity.ok("success");
		}catch (Exception e) {
			
			ResponseError errorObj = new ResponseError();
			
			return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(errorObj);
		}
	
	}

}
