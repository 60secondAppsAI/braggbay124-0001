package com.braggbay124.dao;

import java.util.List;

import com.braggbay124.dao.GenericDAO;
import com.braggbay124.domain.Favorite;





public interface FavoriteDAO extends GenericDAO<Favorite, Integer> {
  
	List<Favorite> findAll();
	






}


