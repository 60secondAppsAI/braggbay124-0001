package com.braggbay124.dao;

import java.util.List;

import com.braggbay124.dao.GenericDAO;
import com.braggbay124.domain.PaymentMethod;





public interface PaymentMethodDAO extends GenericDAO<PaymentMethod, Integer> {
  
	List<PaymentMethod> findAll();
	






}


