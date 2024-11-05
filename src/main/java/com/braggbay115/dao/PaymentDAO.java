package com.braggbay115.dao;

import java.util.List;

import com.braggbay115.dao.GenericDAO;
import com.braggbay115.domain.Payment;





public interface PaymentDAO extends GenericDAO<Payment, Integer> {
  
	List<Payment> findAll();
	






}


