package com.braggbay115.dao;

import java.util.List;

import com.braggbay115.dao.GenericDAO;
import com.braggbay115.domain.Bid;





public interface BidDAO extends GenericDAO<Bid, Integer> {
  
	List<Bid> findAll();
	






}


