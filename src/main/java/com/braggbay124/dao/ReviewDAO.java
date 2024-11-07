package com.braggbay124.dao;

import java.util.List;

import com.braggbay124.dao.GenericDAO;
import com.braggbay124.domain.Review;





public interface ReviewDAO extends GenericDAO<Review, Integer> {
  
	List<Review> findAll();
	






}


