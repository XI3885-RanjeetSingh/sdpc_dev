package com.salam.sdpc.service;

import org.springframework.http.ResponseEntity;

public interface AppointmentService {

	ResponseEntity<?> fetchAppointmentSlots(String day);

}
