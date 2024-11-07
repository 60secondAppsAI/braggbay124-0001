package com.braggbay124.service.impl;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;



import com.braggbay124.dao.GenericDAO;
import com.braggbay124.service.GenericService;
import com.braggbay124.service.impl.GenericServiceImpl;
import com.braggbay124.dao.FavoriteDAO;
import com.braggbay124.domain.Favorite;
import com.braggbay124.dto.FavoriteDTO;
import com.braggbay124.dto.FavoriteSearchDTO;
import com.braggbay124.dto.FavoritePageDTO;
import com.braggbay124.dto.FavoriteConvertCriteriaDTO;
import com.braggbay124.dto.common.RequestDTO;
import com.braggbay124.dto.common.ResultDTO;
import com.braggbay124.service.FavoriteService;
import com.braggbay124.util.ControllerUtils;





@Service
public class FavoriteServiceImpl extends GenericServiceImpl<Favorite, Integer> implements FavoriteService {

    private final static Logger logger = LoggerFactory.getLogger(FavoriteServiceImpl.class);

	@Autowired
	FavoriteDAO favoriteDao;

	


	@Override
	public GenericDAO<Favorite, Integer> getDAO() {
		return (GenericDAO<Favorite, Integer>) favoriteDao;
	}
	
	public List<Favorite> findAll () {
		List<Favorite> favorites = favoriteDao.findAll();
		
		return favorites;	
		
	}

	public ResultDTO addFavorite(FavoriteDTO favoriteDTO, RequestDTO requestDTO) {

		Favorite favorite = new Favorite();

		favorite.setFavoriteId(favoriteDTO.getFavoriteId());


		LocalDate localDate = LocalDate.now();
		ZoneId defaultZoneId = ZoneId.systemDefault();
		Date date = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());

		favorite = favoriteDao.save(favorite);
		
		ResultDTO result = new ResultDTO();
		return result;
	}
	
	public Page<Favorite> getAllFavorites(Pageable pageable) {
		return favoriteDao.findAll(pageable);
	}

	public Page<Favorite> getAllFavorites(Specification<Favorite> spec, Pageable pageable) {
		return favoriteDao.findAll(spec, pageable);
	}

	public ResponseEntity<FavoritePageDTO> getFavorites(FavoriteSearchDTO favoriteSearchDTO) {
	
			Integer favoriteId = favoriteSearchDTO.getFavoriteId(); 
 			String sortBy = favoriteSearchDTO.getSortBy();
			String sortOrder = favoriteSearchDTO.getSortOrder();
			String searchQuery = favoriteSearchDTO.getSearchQuery();
			Integer page = favoriteSearchDTO.getPage();
			Integer size = favoriteSearchDTO.getSize();

	        Specification<Favorite> spec = Specification.where(null);

			spec = ControllerUtils.andIfNecessary(spec, favoriteId, "favoriteId"); 
			

		if (searchQuery != null && !searchQuery.isEmpty()) {
			spec = spec.and((root, query, cb) -> cb.or(

		));}
		
		Sort sort = Sort.unsorted();
		if (sortBy != null && !sortBy.isEmpty() && sortOrder != null && !sortOrder.isEmpty()) {
			if (sortOrder.equalsIgnoreCase("asc")) {
				sort = Sort.by(sortBy).ascending();
			} else if (sortOrder.equalsIgnoreCase("desc")) {
				sort = Sort.by(sortBy).descending();
			}
		}
		Pageable pageable = PageRequest.of(page, size, sort);

		Page<Favorite> favorites = this.getAllFavorites(spec, pageable);
		
		//System.out.println(String.valueOf(favorites.getTotalElements()) + " total ${classNamelPlural}, viewing page X of " + String.valueOf(favorites.getTotalPages()));
		
		List<Favorite> favoritesList = favorites.getContent();
		
		FavoriteConvertCriteriaDTO convertCriteria = new FavoriteConvertCriteriaDTO();
		List<FavoriteDTO> favoriteDTOs = this.convertFavoritesToFavoriteDTOs(favoritesList,convertCriteria);
		
		FavoritePageDTO favoritePageDTO = new FavoritePageDTO();
		favoritePageDTO.setFavorites(favoriteDTOs);
		favoritePageDTO.setTotalElements(favorites.getTotalElements());
		return ResponseEntity.ok(favoritePageDTO);
	}

	public List<FavoriteDTO> convertFavoritesToFavoriteDTOs(List<Favorite> favorites, FavoriteConvertCriteriaDTO convertCriteria) {
		
		List<FavoriteDTO> favoriteDTOs = new ArrayList<FavoriteDTO>();
		
		for (Favorite favorite : favorites) {
			favoriteDTOs.add(convertFavoriteToFavoriteDTO(favorite,convertCriteria));
		}
		
		return favoriteDTOs;

	}
	
	public FavoriteDTO convertFavoriteToFavoriteDTO(Favorite favorite, FavoriteConvertCriteriaDTO convertCriteria) {
		
		FavoriteDTO favoriteDTO = new FavoriteDTO();
		
		favoriteDTO.setFavoriteId(favorite.getFavoriteId());

	

		
		return favoriteDTO;
	}

	public ResultDTO updateFavorite(FavoriteDTO favoriteDTO, RequestDTO requestDTO) {
		
		Favorite favorite = favoriteDao.getById(favoriteDTO.getFavoriteId());

		favorite.setFavoriteId(ControllerUtils.setValue(favorite.getFavoriteId(), favoriteDTO.getFavoriteId()));



        favorite = favoriteDao.save(favorite);
		
		ResultDTO result = new ResultDTO();
		return result;
	}

	public FavoriteDTO getFavoriteDTOById(Integer favoriteId) {
	
		Favorite favorite = favoriteDao.getById(favoriteId);
			
		
		FavoriteConvertCriteriaDTO convertCriteria = new FavoriteConvertCriteriaDTO();
		return(this.convertFavoriteToFavoriteDTO(favorite,convertCriteria));
	}







}
