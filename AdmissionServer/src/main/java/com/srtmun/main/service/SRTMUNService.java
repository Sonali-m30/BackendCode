package com.srtmun.main.service;

import java.util.List;

import com.srtmun.main.model.Srtmun;

public interface SRTMUNService {

	public Srtmun saveAllAdmissions(Srtmun srt);

	public List<Srtmun> getAllDetails();

	public Srtmun editAdmissionDetails(int admissionId,Srtmun srt);

	public void deleteAdmissionDetails(int admissionId);

}
