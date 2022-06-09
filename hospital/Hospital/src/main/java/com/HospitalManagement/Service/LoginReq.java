package com.HospitalManagement.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoginReq {

    String userName ;
    String password;
	public String getUserName() {
		// TODO Auto-generated method stub
		return this.userName;
	}
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}
	public void setUserName(String res) {
		// TODO Auto-generated method stub
		
	}
	public void setPassword(String string) {
		// TODO Auto-generated method stub
		
	}



}
