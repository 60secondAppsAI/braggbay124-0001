package com.braggbay124.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.braggbay124.domain.Watchlist;
import com.braggbay124.dto.WatchlistDTO;
import com.braggbay124.dto.WatchlistSearchDTO;
import com.braggbay124.dto.WatchlistPageDTO;
import com.braggbay124.dto.WatchlistConvertCriteriaDTO;
import com.braggbay124.service.GenericService;
import com.braggbay124.dto.common.RequestDTO;
import com.braggbay124.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface WatchlistService extends GenericService<Watchlist, Integer> {

	List<Watchlist> findAll();

	ResultDTO addWatchlist(WatchlistDTO watchlistDTO, RequestDTO requestDTO);

	ResultDTO updateWatchlist(WatchlistDTO watchlistDTO, RequestDTO requestDTO);

    Page<Watchlist> getAllWatchlists(Pageable pageable);

    Page<Watchlist> getAllWatchlists(Specification<Watchlist> spec, Pageable pageable);

	ResponseEntity<WatchlistPageDTO> getWatchlists(WatchlistSearchDTO watchlistSearchDTO);
	
	List<WatchlistDTO> convertWatchlistsToWatchlistDTOs(List<Watchlist> watchlists, WatchlistConvertCriteriaDTO convertCriteria);

	WatchlistDTO getWatchlistDTOById(Integer watchlistId);







}





