package com.braggbay124.controller;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.List;
import java.util.ArrayList;


import com.braggbay124.util.Util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.sql.Timestamp;
import java.util.Date;

import com.braggbay124.domain.Favorite;
import com.braggbay124.dto.FavoriteDTO;
import com.braggbay124.dto.FavoriteSearchDTO;
import com.braggbay124.dto.FavoritePageDTO;
import com.braggbay124.service.FavoriteService;
import com.braggbay124.dto.common.RequestDTO;
import com.braggbay124.dto.common.ResultDTO;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.multipart.MultipartFile;




@CrossOrigin(origins = "*")
@RequestMapping("/favorite")
@RestController
public class FavoriteController {

	private final static Logger logger = LoggerFactory.getLogger(FavoriteController.class);

	@Autowired
	FavoriteService favoriteService;



	@RequestMapping(value="/", method = RequestMethod.GET)
	public List<Favorite> getAll() {

		List<Favorite> favorites = favoriteService.findAll();
		
		return favorites;	
	}

	@GetMapping(value = "/{favoriteId}")
	@ResponseBody
	public FavoriteDTO getFavorite(@PathVariable Integer favoriteId) {
		
		return (favoriteService.getFavoriteDTOById(favoriteId));
	}

 	@RequestMapping(value = "/addFavorite", method = RequestMethod.POST)
	public ResponseEntity<?> addFavorite(@RequestBody FavoriteDTO favoriteDTO, HttpServletRequest request) {

		RequestDTO requestDTO = new RequestDTO(request);
		ResultDTO result = favoriteService.addFavorite(favoriteDTO, requestDTO);
		
		return result.asResponseEntity();
	}

	@GetMapping("/favorites")
	public ResponseEntity<FavoritePageDTO> getFavorites(FavoriteSearchDTO favoriteSearchDTO) {
 
		return favoriteService.getFavorites(favoriteSearchDTO);
	}	

	@RequestMapping(value = "/updateFavorite", method = RequestMethod.POST)
	public ResponseEntity<?> updateFavorite(@RequestBody FavoriteDTO favoriteDTO, HttpServletRequest request) {
		RequestDTO requestDTO = new RequestDTO(request);
		ResultDTO result = favoriteService.updateFavorite(favoriteDTO, requestDTO);
		
//		if (result.isSuccessful()) {
//		}

		return result.asResponseEntity();
	}



}
