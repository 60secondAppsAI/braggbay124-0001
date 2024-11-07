package com.braggbay124.dto;

import java.sql.Timestamp;
import java.time.Year;
import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ItemSearchDTO {

	private Integer page = 0;
	private Integer size;
	private String sortBy;
	private String sortOrder;
	private String searchQuery;

	private Integer itemId;
	
	private String name;
	
	private String description;
	
	private Double startingPrice;
	
	private Double currentPrice;
	
}
