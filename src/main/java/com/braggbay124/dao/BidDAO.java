package com.braggbay124.dao;

import java.util.List;

import com.braggbay124.dao.GenericDAO;
import com.braggbay124.domain.Bid;





public interface BidDAO extends GenericDAO<Bid, Integer> {
  
	List<Bid> findAll();
	






}


