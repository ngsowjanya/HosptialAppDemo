package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.patient.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Integer> {

	

}
