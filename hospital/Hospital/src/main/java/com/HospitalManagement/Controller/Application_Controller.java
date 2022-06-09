package com.HospitalManagement.Controller;


import com.HospitalManagement.Entity.Patient;
import com.HospitalManagement.Entity.Users;
import com.HospitalManagement.Service.Application_Service;
import com.HospitalManagement.Service.LoginReq;
import com.HospitalManagement.Service.Login_Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/hospital")
public class Application_Controller {
    public static final String APPLICATION_JSON = "application/json";
    @Autowired
    Login_Service login_service;

    @Autowired
    Application_Service application_service;

    @CrossOrigin(origins = "http://localhost:4200/")
    @RequestMapping(value = "/logIn", method = RequestMethod.POST,produces = APPLICATION_JSON)
    public ResponseEntity<?> logIn(@RequestBody LoginReq req){

       Users user = login_service.logIn(req.getUserName(),req.getPassword());
        return new ResponseEntity(user, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://localhost:4200/")
    @RequestMapping(value = "/add-patient", method = RequestMethod.POST,produces = APPLICATION_JSON)
    public ResponseEntity<?> addPatient(@RequestBody Patient patient){

     String res =   application_service.addPatient(patient);
        LoginReq l = new LoginReq();
        l.setUserName(res);
        l.setPassword("pass");


        return new ResponseEntity(l, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200/")
    @RequestMapping(value = "/test", method = RequestMethod.GET,produces = APPLICATION_JSON)
    public ResponseEntity<Users> testing(){

System.out.println("hii");
Users u =new Users();

return  ResponseEntity.ok(u);
        //return new ResponseEntity("helloworld!", HttpStatus.OK);
    }

}
