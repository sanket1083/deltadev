package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Cibil;
import com.cjc.model.Dealer;
import com.cjc.service.Service;

@RestController
@CrossOrigin("*")
public class Controller {

	@Autowired
	Service s;
	
	@PostMapping("/saveData")
	public String datasave(@RequestBody Cibil cc)
	{
		s.saveAllData(cc);
		
		return "Data Saved";
		
	}
	
	@GetMapping("/getsinglecibildata/{cibilpanid}")
	public Cibil getSingleData(@PathVariable(value = "cibilpanid") String cibilpanid)
	{
	
		Cibil ss = s. getSingleData(cibilpanid);
		return  ss;
		
	}
	
	@PutMapping("/updaedata/{cibilpanid}")
	public Cibil updateData(@PathVariable("cibilpanid") String cibilpanid)
	{
		Cibil c=s.updateData(cibilpanid);
		return c;
		
	}
	
	//for Dealer Entity Class
	
	@GetMapping("/getdealerdata/{dealerregistrationid}")
	public Dealer saveDealerData1(@PathVariable int dealerregistrationid)
	{
		Dealer d=s.saveDealerData(dealerregistrationid);
//		if(d!=null)
//		{
//			return new  ResponseEntity<Dealer>(HttpStatus.OK);
//		}
//		else {
//			throw new  DealerRegistrationIdNotFoundException("Dealer not Found");
//		}
		return d;
		
	}
	
	@PostMapping("/savedealerdata")
	public String saveDealerData(@RequestBody Dealer d)
	{
		s.saveDealerData(d);
		return "Data saved";
		
	}

	@GetMapping("/getdealerData")
	public Iterable<Dealer> getAllDataDealer()
	{
Iterable<Dealer> dd		=s.getDelaerData();

return dd;
		
	}
}