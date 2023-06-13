package com.yagoinc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yagoinc.course.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
