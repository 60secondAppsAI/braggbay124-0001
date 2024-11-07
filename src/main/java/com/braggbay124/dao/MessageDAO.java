package com.braggbay124.dao;

import java.util.List;

import com.braggbay124.dao.GenericDAO;
import com.braggbay124.domain.Message;





public interface MessageDAO extends GenericDAO<Message, Integer> {
  
	List<Message> findAll();
	






}


