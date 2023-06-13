package com.yagoinc.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yagoinc.course.entities.Patient;
import com.yagoinc.course.services.PatientService;

@RestController
@RequestMapping(value = "/patients")
public class PatientResource {

	@Autowired
	private PatientService service;

	@GetMapping
	public ResponseEntity<List<Patient>> findAll() {
		List<Patient> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
