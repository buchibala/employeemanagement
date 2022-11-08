package com.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.school.model.Payment;
import com.school.model.Progress;
import com.school.service.ManageService;

@RestController
public class ManageController {

	@Autowired
	ManageService manageService;
	
	
	@PostMapping("/payment")
	Payment addPayment(@RequestBody Payment payment) {
		
		return manageService.addPayment(payment);
	}
	
	@PostMapping("/progress")
	Progress addProgress(@RequestBody Progress progress) {
		
		return manageService.addProgress(progress);
	}
	
	@PostMapping("/getStudentPayment")
	Payment getStudentPayment(@RequestBody Payment payment) {
		
		return manageService.getStudentPayment(payment);
	}
	
}
