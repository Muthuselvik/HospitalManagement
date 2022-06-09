package com.HospitalManagement.Service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.HospitalManagement.Entity.Doctor;
import com.HospitalManagement.Repository.DoctorRepository;



@Service
public class DoctorServiceImpl  implements DoctorService{

	DoctorRepository doctorRepository;

	public DoctorServiceImpl(DoctorRepository doctorRepository) {
		super();
		this.doctorRepository = doctorRepository;
	}
	@Override
	public Doctor saveDoctor(Doctor doctor) {
		return doctorRepository.save(doctor);
		
	}
	@Override
	public List<Doctor> listAllDoctor() {
		
		return null;
	}

}

