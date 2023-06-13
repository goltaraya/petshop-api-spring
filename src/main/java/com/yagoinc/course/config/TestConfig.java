package com.yagoinc.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.yagoinc.course.entities.Doctor;
import com.yagoinc.course.entities.Patient;
import com.yagoinc.course.entities.User;
import com.yagoinc.course.entities.enums.Gender;
import com.yagoinc.course.repositories.DoctorRepository;
import com.yagoinc.course.repositories.PatientRepository;
import com.yagoinc.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;

	@Autowired
	PatientRepository patientRepository;

	@Autowired
	DoctorRepository doctorRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Yago Alexandre", "yago@mail.com", "998980921", "1234", true);
		User u2 = new User(null, "Ciro Dourado", "ciro@mail.com", "998293819", "1234", true);
		User u3 = new User(null, "Thiago Gonzalez", "thiago@mail.com", "973829189", "1234", false);
		User u4 = new User(null, "Débora Pereira", "debora@mail.com", "992018392", "1234", false);
		User u5 = new User(null, "Gustavo Diniz", "gustavo@mail.com", "982931782", "1234", true);

		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5));

		Patient p1 = new Patient(null, "Pedrinho", Gender.MALE, Instant.parse("2015-11-01T10:15:30.00Z"), "Felino",
				"Siamês", 6.2);
		Patient p2 = new Patient(null, "Julie", Gender.FEMALE, Instant.parse("2018-01-10T10:15:30.00Z"), "Canino",
				"Chow chow", 30.0);
		Patient p3 = new Patient(null, "Brad", Gender.MALE, Instant.parse("2018-10-15T10:15:30.00Z"), "Canino",
				"Chow chow", 14.8);
		Patient p4 = new Patient(null, "Cristal", Gender.FEMALE, Instant.parse("2015-05-08T10:15:30.00Z"), "Felino",
				"Pinscher", 5.4);

		patientRepository.saveAll(Arrays.asList(p1, p2, p3, p4));

		Doctor d1 = new Doctor(null, "Gabriel Câncio", "cancio@mail.com", "987983928", "1234", false, "Nutrição animal",
				"873827");
		Doctor d2 = new Doctor(null, "Pedro Lucas", "pedro@mail.com", "981782928", "1234", false, "Parto de equinos",
				"873827");
		doctorRepository.saveAll(Arrays.asList(d1, d2));
	}
}
