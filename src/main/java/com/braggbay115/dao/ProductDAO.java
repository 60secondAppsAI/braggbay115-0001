package com.braggbay115.dao;

import java.util.List;

import com.braggbay115.dao.GenericDAO;
import com.braggbay115.domain.Product;





public interface ProductDAO extends GenericDAO<Product, Integer> {
  
	List<Product> findAll();
	






}


