package com.srtmun.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Srtmun {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int admissionId;
	private String admissionName;
	private String admissionStartDate;
	private String admissionEndDate;
	
	public int getAdmissionId() {
		return admissionId;
	}
	public void setAdmissionId(int admissionId) {
		this.admissionId = admissionId;
	}
	public String getAdmissionName() {
		return admissionName;
	}
	public void setAdmissionName(String admissionName) {
		this.admissionName = admissionName;
	}
	public String getAdmissionStartDate() {
		return admissionStartDate;
	}
	public void setAdmissionStartDate(String admissionStartDate) {
		this.admissionStartDate = admissionStartDate;
	}
	public String getAdmissionEndDate() {
		return admissionEndDate;
	}
	public void setAdmissionEndDate(String admissionEndDate) {
		this.admissionEndDate = admissionEndDate;
	}
	
}
