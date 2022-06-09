package com.HospitalManagement.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.HospitalManagement.Entity.Users;

public interface UserRepository extends JpaRepository<Users, Long>, JpaSpecificationExecutor<Long> {

  Users findByusername(String name);



    }
