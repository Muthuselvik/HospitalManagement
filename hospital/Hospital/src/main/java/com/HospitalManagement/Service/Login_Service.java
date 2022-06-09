package com.HospitalManagement.Service;



import com.HospitalManagement.Entity.Users;
import com.HospitalManagement.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Login_Service {
    @Autowired
    UserRepository userInterface;

    public Users logIn(String userName, String password)
    {
        Users user =   userInterface.findByusername(userName);
        Users getUser = null;
        if((user != null)&&(user.getPassword().equals(password)))
        {

            getUser = user;

        }

        return getUser;
    }
}
