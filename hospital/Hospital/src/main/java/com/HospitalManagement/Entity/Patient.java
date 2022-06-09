package com.HospitalManagement.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "patient_tbl")
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    @Id
    @Column(name="patient_id")
    @GeneratedValue
    private long patientId;

    @Column(name="patient_name")
    private String patientName;

    @Column(name="gender")
    private String gender;

    @Column(name="age")
    private int age;

    @Column(name="dateofbirth")
    private Date  dateOfBirth;

    @Column(name="email_id")
    private String emailId;

    @Column(name="maritalstatus")
    private String maritalStatus;

    @Column(name="contact_no")
    private int contactNo;


    @Column(name="address")
    private  String address;

    @Column(name=" doctor_name")
    private  String doctorName;

    @Column(name="reason")
    private   String reason;;

    @Column(name="admit_date")
    private LocalDateTime admitDate;

	public long getPatientId() {
		return patientId;
	}

	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public LocalDateTime getAdmitDate() {
		return admitDate;
	}

	public void setAdmitDate(LocalDateTime admitDate) {
		this.admitDate = admitDate;
	}

	
   /* @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;*/

}