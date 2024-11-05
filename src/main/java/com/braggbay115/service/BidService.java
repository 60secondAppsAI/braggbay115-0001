package com.braggbay115.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.braggbay115.domain.Bid;
import com.braggbay115.dto.BidDTO;
import com.braggbay115.dto.BidSearchDTO;
import com.braggbay115.dto.BidPageDTO;
import com.braggbay115.dto.BidConvertCriteriaDTO;
import com.braggbay115.service.GenericService;
import com.braggbay115.dto.common.RequestDTO;
import com.braggbay115.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface BidService extends GenericService<Bid, Integer> {

	List<Bid> findAll();

	ResultDTO addBid(BidDTO bidDTO, RequestDTO requestDTO);

	ResultDTO updateBid(BidDTO bidDTO, RequestDTO requestDTO);

    Page<Bid> getAllBids(Pageable pageable);

    Page<Bid> getAllBids(Specification<Bid> spec, Pageable pageable);

	ResponseEntity<BidPageDTO> getBids(BidSearchDTO bidSearchDTO);
	
	List<BidDTO> convertBidsToBidDTOs(List<Bid> bids, BidConvertCriteriaDTO convertCriteria);

	BidDTO getBidDTOById(Integer bidId);







}





