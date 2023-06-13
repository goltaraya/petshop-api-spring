package com.yagoinc.course.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_doctor")
public class Doctor extends User {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String specialty;
	private String crmId;

	public Doctor () {
	}
	
	public Doctor(Long id, String name, String email, String phone, String password, Boolean isAdmin, String specialty,
			String crmId) {
		super(id, name, email, phone, password, isAdmin);
		this.specialty = specialty;
		this.crmId = crmId;
	}

	public String getCrmId() {
		return crmId;
	}

	public void setCrmId(String crmId) {
		this.crmId = crmId;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

}
