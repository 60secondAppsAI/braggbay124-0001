package com.braggbay124.dao;

import java.util.List;

import com.braggbay124.dao.GenericDAO;
import com.braggbay124.domain.Item;





public interface ItemDAO extends GenericDAO<Item, Integer> {
  
	List<Item> findAll();
	






}


