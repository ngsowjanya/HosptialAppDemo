package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.patient.Patient;
import com.example.demo.repo.PatientRepo;

@Service
public class PatientServiceImpl implements PatientService{

	@Autowired
	PatientRepo patientrepo;
	
	public Patient savePatient(Patient patient) {
		// TODO Auto-generated method stub
		return patientrepo.save(patient);
	}
	
	public List<Patient> getAllPatient() {
		// TODO Auto-generated method stub
		return patientrepo.findAll();
	}

	public List<Patient> saveAllPatient(List<Patient> patient) {
		// TODO Auto-generated method stub
		return patientrepo.saveAllAndFlush(patient);
	}

	public Patient getPatient(int id) {
		// TODO Auto-generated method stub
				Optional<Patient> patientOptional= patientrepo.findById(id);
				return patientOptional.orElse(null);
	}

	public Patient updateById(int id, Patient patient) {
		// TODO Auto-generated method stub
		Patient existingPatient = patientrepo.findById(id)
		.orElseThrow(() -> new IllegalArgumentException("Patient not found" + id));
		existingPatient.setPatientName(patient.getPatientName());
		existingPatient.setPlace(patient.getPlace());
		return patientrepo.save(existingPatient);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		Patient patient = patientrepo.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Patient not found"+ id));
		patientrepo.delete(patient);
	}

	

}
