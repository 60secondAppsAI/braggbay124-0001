package com.braggbay124.dao;

import java.util.List;

import com.braggbay124.dao.GenericDAO;
import com.braggbay124.domain.Invoice;





public interface InvoiceDAO extends GenericDAO<Invoice, Integer> {
  
	List<Invoice> findAll();
	






}


