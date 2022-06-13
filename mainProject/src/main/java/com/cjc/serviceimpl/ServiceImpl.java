package com.cjc.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cjc.exception.DealerRegistrationIdNotFoundException;
import com.cjc.model.Cibil;
import com.cjc.model.Dealer;
import com.cjc.repository.CibilRepository;
import com.cjc.repository.DealerRepository;


@Service
public class ServiceImpl implements com.cjc.service.Service{

	@Autowired
	CibilRepository r;
	@Autowired
	DealerRepository dr;
	
	@Override
	public void saveAllData(Cibil c) {

		r.save(c);
	}

	@Override
	public Cibil getSingleData(String cibilpanid) {
		
		return r.findByCibilpanid(cibilpanid);
	}

	@Override
	public Cibil updateData(String cibilpanid) {
		// TODO Auto-generated method stub
		return r.save(cibilpanid);
	}

	//for Dealer Entity Class
	
	@Override
	public Dealer saveDealerData(int dealerregistrationid) {

//		 Dealer ff = dr.findByDealerregistrationid(dealerregistrationid);
//		 
//		 if(ff!=null)
//				{
//			// return d.findByDealerregistrationid(dealerregistrationid);
//					return new  ResponseEntity<Dealer>(HttpStatus.OK);
//				}
//				else {
//					throw new  DealerRegistrationIdNotFoundException("Dealer not Found");
//				}
		return dr.findByDealerregistrationid(dealerregistrationid);
		
	}

	@Override
	public void saveDealerData(Dealer d) {

		dr.save(d);
	}

	@Override
	public Iterable<Dealer> getDelaerData() {
		
		return dr.findAll();
	}
	
		
	}

	

	
	


