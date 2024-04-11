package com.example.demo.patient;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int patientId;
	private String patientName;
	private int age;
	private String place;
	
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(int patientId, String patientName, int age, String place) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.age = age;
		this.place = place;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", age=" + age + ", place=" + place
				+ "]";
	}
	
	
	
	
}
