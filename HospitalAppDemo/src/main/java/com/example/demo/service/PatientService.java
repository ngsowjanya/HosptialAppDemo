package com.example.demo.service;

import java.util.List;

import com.example.demo.patient.Patient;

public interface PatientService {
	
	public Patient savePatient(Patient patient);
	
	public List<Patient> saveAllPatient(List<Patient> patient);
	
	public Patient updateById(int id, Patient patient);
	
	public void deleteById(int id);
	
	public Patient getPatient(int id);
	
	public List<Patient> getAllPatient();
	

}
