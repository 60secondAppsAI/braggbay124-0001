package com.braggbay124.dao;

import java.util.List;

import com.braggbay124.dao.GenericDAO;
import com.braggbay124.domain.Cart;





public interface CartDAO extends GenericDAO<Cart, Integer> {
  
	List<Cart> findAll();
	






}


