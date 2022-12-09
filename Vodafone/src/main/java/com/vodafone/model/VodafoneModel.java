package com.vodafone.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class VodafoneModel {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="emp_id")
	private Integer empId;
    
	
    @Column(name="emp_name")
	private String empName;
    
    @Column(name="emp_city")
	private String empCity;
	
    
    @Column(name="emp_phoneNo")
	private Integer empPhoneNo;


	public Integer getEmpId() {
		return empId;
	}


	public void setEmpId(Integer empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmpCity() {
		return empCity;
	}


	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}


	public Integer getEmpPhoneNo() {
		return empPhoneNo;
	}


	public void setEmpPhoneNo(Integer empPhoneNo) {
		this.empPhoneNo = empPhoneNo;
	}

}
