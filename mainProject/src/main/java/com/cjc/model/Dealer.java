package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Dealer {

	@Id
	private int dealerregistrationid;
	private String dealername;
	private String delaerofficename;
	private String dealerofficeaddress;
	private String dealerbankname;
	private String dealerbankaccountnumber;
	private String dealerbankifsc;
	private String dealerbankaddress;
	private String dealeremailid;
	private String dealermobilenumber;
	
}
