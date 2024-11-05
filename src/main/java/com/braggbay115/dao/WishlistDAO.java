package com.braggbay115.dao;

import java.util.List;

import com.braggbay115.dao.GenericDAO;
import com.braggbay115.domain.Wishlist;





public interface WishlistDAO extends GenericDAO<Wishlist, Integer> {
  
	List<Wishlist> findAll();
	






}


