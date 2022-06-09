package com.HospitalManagement.Service;


import com.HospitalManagement.Entity.Patient;
import com.HospitalManagement.Repository.PatientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDateTime;


@Service
public class Application_Service {




    @Autowired
    PatientRepository patientInterface;
    public String addPatient(Patient patient)
    {

        patient.setAdmitDate(LocalDateTime.now());
        String response ="";

     String name =   patientInterface.save(patient).getPatientName();
     if(!name.equals(null))
     {
         response = name;
     }
     else{

         response = "Action Failed";
     }


      return  response;
    }

}
