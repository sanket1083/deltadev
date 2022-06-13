package com.cjc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.cjc.model.Dealer;

@Repository
public interface DealerRepository extends JpaRepository<Dealer, Integer>{

	Dealer findByDealerregistrationid(int id);
	
}
