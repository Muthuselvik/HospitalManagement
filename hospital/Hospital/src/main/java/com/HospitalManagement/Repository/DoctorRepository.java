package com.HospitalManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HospitalManagement.Entity.Doctor;

public interface DoctorRepository  extends JpaRepository<Doctor,Long>{
	
	
}


