package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Cibil {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name = "MY_ID", unique = true, nullable = false)
	private String cibilpanid;
	

	private String cibilstatus;
	private String mobilenumber;
	private String companyname;

	
}
