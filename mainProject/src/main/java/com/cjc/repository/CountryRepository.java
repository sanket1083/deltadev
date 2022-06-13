package com.cjc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Country;

@Repository
public interface CountryRepository extends CrudRepository<Country, Integer>{

}
