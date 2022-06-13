package com.cjc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.State;

@Repository
public interface StateRepository extends CrudRepository<State, Integer>{

}
