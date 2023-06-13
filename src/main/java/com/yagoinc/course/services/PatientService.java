package com.yagoinc.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yagoinc.course.entities.Patient;
import com.yagoinc.course.repositories.PatientRepository;

@Service
public class PatientService {

	@Autowired
	private PatientRepository repository;
	
	public List<Patient> findAll(){
		return repository.findAll();
	}
}
