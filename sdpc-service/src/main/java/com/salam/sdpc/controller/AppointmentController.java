package com.salam.sdpc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.salam.sdpc.service.AppointmentService;

@RestController
public class AppointmentController {
	
	@Autowired
	AppointmentService appointmentService;
	
	@GetMapping(value="/appoinments/{day}/slots", produces =MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> fetchAppointmentSlots(@PathVariable String day){
		return appointmentService.fetchAppointmentSlots(day);
		
	}
}
