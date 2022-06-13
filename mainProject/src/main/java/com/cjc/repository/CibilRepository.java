package com.cjc.repository;

import org.springframework.data.repository.CrudRepository;

import com.cjc.model.Cibil;

@org.springframework.stereotype.Repository
public interface CibilRepository extends CrudRepository<Cibil, Integer>{

	Cibil findByCibilpanid(String cibilpanid);

	Cibil save(String cibilpanid);

}
