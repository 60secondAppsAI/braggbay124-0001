package com.braggbay124.dao;

import java.util.List;

import com.braggbay124.dao.GenericDAO;
import com.braggbay124.domain.Seller;





public interface SellerDAO extends GenericDAO<Seller, Integer> {
  
	List<Seller> findAll();
	






}

