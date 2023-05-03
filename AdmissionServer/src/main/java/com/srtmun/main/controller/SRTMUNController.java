package com.srtmun.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.srtmun.main.model.Srtmun;
import com.srtmun.main.service.SRTMUNService;

@RestController
public class SRTMUNController {

	@Autowired
	SRTMUNService srt_service;
	
	@PostMapping("/addAdmissions")
	public Srtmun saveAdmissions(@RequestBody Srtmun srt) {
		
		Srtmun saveAd=srt_service.saveAllAdmissions(srt);
		return saveAd;
	}
	
	@GetMapping("/getAdmissions")
	public List<Srtmun> getList(){
		
		List<Srtmun> admissions=srt_service.getAllDetails();
		return admissions;
	}
	
	@PutMapping("/updateAdmissions/{admissionId}")
	public Srtmun changeInAdmissions(@PathVariable int admissionId,@RequestBody Srtmun srt) {
		
		Srtmun change=srt_service.editAdmissionDetails(admissionId,srt);
		return change;
	}
	
	@DeleteMapping("/deleteAdmissions/{admissionId}")
	public void deleteAdmissions(@PathVariable int admissionId) {
		
		srt_service.deleteAdmissionDetails(admissionId);
	}
	
}
