package com.cjc.service;

import com.cjc.model.Cibil;
import com.cjc.model.Dealer;

public interface Service {

	void saveAllData(Cibil c);

	Cibil getSingleData(String cibilpanid);

	Cibil updateData(String cibilpanid);
	
	//method for Dealer Entity Class

	Dealer saveDealerData(int dealerregistrationid);

	void saveDealerData(Dealer d);

	Iterable<Dealer> getDelaerData();

}
