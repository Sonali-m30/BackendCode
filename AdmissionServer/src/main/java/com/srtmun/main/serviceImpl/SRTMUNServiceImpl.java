package com.srtmun.main.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srtmun.main.model.Srtmun;
import com.srtmun.main.repository.SRTMUNRepository;
import com.srtmun.main.service.SRTMUNService;

@Service
public class SRTMUNServiceImpl implements SRTMUNService{

	@Autowired
	SRTMUNRepository srt_repository;

	@Override
	public Srtmun saveAllAdmissions(Srtmun srt) {
		
		return srt_repository.save(srt);
	}

	@Override
	public List<Srtmun> getAllDetails() {
		
		return srt_repository.findAll();
	}

	@Override
	public Srtmun editAdmissionDetails(int admissionId,Srtmun srt) {
		
		Optional<Srtmun> search=srt_repository.findById(admissionId);
	
	    if(search.isPresent()) {
	    	srt.setAdmissionId(search.get().getAdmissionId());
	    	return srt_repository.save(srt);
	    }
	    else {
	    	return new Srtmun();
	    }
	}

	@Override
	public void deleteAdmissionDetails(int admissionId) {
		
		srt_repository.deleteById(admissionId);;
	}
	
}
