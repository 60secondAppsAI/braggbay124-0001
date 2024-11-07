package com.braggbay124.dao;

import java.util.List;

import com.braggbay124.dao.GenericDAO;
import com.braggbay124.domain.Shipment;





public interface ShipmentDAO extends GenericDAO<Shipment, Integer> {
  
	List<Shipment> findAll();
	






}


