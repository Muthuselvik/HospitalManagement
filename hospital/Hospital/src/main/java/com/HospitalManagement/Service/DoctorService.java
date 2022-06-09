package com.HospitalManagement.Service;

import java.util.List;

import com.HospitalManagement.Entity.Doctor;



public interface DoctorService {
	
	Doctor saveDoctor(Doctor doctor);
	     List<Doctor> listAllDoctor();


}


     