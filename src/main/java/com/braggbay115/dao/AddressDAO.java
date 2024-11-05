package com.braggbay115.dao;

import java.util.List;

import com.braggbay115.dao.GenericDAO;
import com.braggbay115.domain.Address;





public interface AddressDAO extends GenericDAO<Address, Integer> {
  
	List<Address> findAll();
	






}


