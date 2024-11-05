package com.braggbay115.dao;

import java.util.List;

import com.braggbay115.dao.GenericDAO;
import com.braggbay115.domain.Auction;





public interface AuctionDAO extends GenericDAO<Auction, Integer> {
  
	List<Auction> findAll();
	






}


