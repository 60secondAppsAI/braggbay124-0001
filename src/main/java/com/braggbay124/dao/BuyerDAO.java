package com.braggbay124.dao;

import java.util.List;

import com.braggbay124.dao.GenericDAO;
import com.braggbay124.domain.Buyer;





public interface BuyerDAO extends GenericDAO<Buyer, Integer> {
  
	List<Buyer> findAll();
	






}


