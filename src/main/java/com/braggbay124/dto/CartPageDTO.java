package com.braggbay124.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CartPageDTO {

	private Integer page = 0;
	private Long totalElements = 0L;

	private List<CartDTO> carts;
}




