package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.patient.Patient;
import com.example.demo.service.PatientServiceImpl;

@RestController
@RequestMapping("/api")
public class PatientController {
	@Autowired
	private PatientServiceImpl patientServiceImpl;
   
    @PostMapping("/patient")
    public ResponseEntity<Patient> createPatient(@RequestBody Patient patient) {
        // Logic to create a new user
    	Patient newPatient = patientServiceImpl.savePatient(patient);
        return  new ResponseEntity<>(newPatient, HttpStatus.CREATED);
    }
    
    @PostMapping("/patients")
    public ResponseEntity<List<Patient>> saveAllPatients(@RequestBody List<Patient> patients){
    	List<Patient> savedPatients = patientServiceImpl.saveAllPatient(patients);
    	return new ResponseEntity<>(savedPatients, HttpStatus.CREATED);
    }
    
    @GetMapping("/patients/{id}")
    public ResponseEntity<Patient> getPatientById(@PathVariable int id){
    	Patient patient = patientServiceImpl.getPatient(id);
    	if(patient != null) {
    		return new ResponseEntity<>(patient, HttpStatus.OK);
    		
    	}else {
    		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    	}
    }
    
    @GetMapping("/getAllPatients")
    public ResponseEntity<List<Patient>> getAllPatientDetails(){
    	List<Patient> getAllPatients = patientServiceImpl.getAllPatient();
    	return new ResponseEntity<>(getAllPatients, HttpStatus.OK);
    }
    
    @PutMapping("/updatePatient/{id}")
    public Patient updatePatient(@PathVariable int id , @RequestBody Patient patient) {
    	return patientServiceImpl.updateById(id, patient);
    }
    
    @DeleteMapping("/deletePatient/{id}")
    public void deletePatient(@PathVariable int id) {
    	patientServiceImpl.deleteById(id);
    }
    
}
