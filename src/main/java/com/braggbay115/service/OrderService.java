package com.braggbay115.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.braggbay115.domain.Order;
import com.braggbay115.dto.OrderDTO;
import com.braggbay115.dto.OrderSearchDTO;
import com.braggbay115.dto.OrderPageDTO;
import com.braggbay115.dto.OrderConvertCriteriaDTO;
import com.braggbay115.service.GenericService;
import com.braggbay115.dto.common.RequestDTO;
import com.braggbay115.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface OrderService extends GenericService<Order, Integer> {

	List<Order> findAll();

	ResultDTO addOrder(OrderDTO orderDTO, RequestDTO requestDTO);

	ResultDTO updateOrder(OrderDTO orderDTO, RequestDTO requestDTO);

    Page<Order> getAllOrders(Pageable pageable);

    Page<Order> getAllOrders(Specification<Order> spec, Pageable pageable);

	ResponseEntity<OrderPageDTO> getOrders(OrderSearchDTO orderSearchDTO);
	
	List<OrderDTO> convertOrdersToOrderDTOs(List<Order> orders, OrderConvertCriteriaDTO convertCriteria);

	OrderDTO getOrderDTOById(Integer orderId);







}




