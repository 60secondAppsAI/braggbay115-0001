package com.braggbay115.dao;

import java.util.List;

import com.braggbay115.dao.GenericDAO;
import com.braggbay115.domain.Review;





public interface ReviewDAO extends GenericDAO<Review, Integer> {
  
	List<Review> findAll();
	






}


