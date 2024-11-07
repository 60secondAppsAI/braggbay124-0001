package com.braggbay124.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.braggbay124.domain.PaymentMethod;
import com.braggbay124.dto.PaymentMethodDTO;
import com.braggbay124.dto.PaymentMethodSearchDTO;
import com.braggbay124.dto.PaymentMethodPageDTO;
import com.braggbay124.dto.PaymentMethodConvertCriteriaDTO;
import com.braggbay124.service.GenericService;
import com.braggbay124.dto.common.RequestDTO;
import com.braggbay124.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface PaymentMethodService extends GenericService<PaymentMethod, Integer> {

	List<PaymentMethod> findAll();

	ResultDTO addPaymentMethod(PaymentMethodDTO paymentMethodDTO, RequestDTO requestDTO);

	ResultDTO updatePaymentMethod(PaymentMethodDTO paymentMethodDTO, RequestDTO requestDTO);

    Page<PaymentMethod> getAllPaymentMethods(Pageable pageable);

    Page<PaymentMethod> getAllPaymentMethods(Specification<PaymentMethod> spec, Pageable pageable);

	ResponseEntity<PaymentMethodPageDTO> getPaymentMethods(PaymentMethodSearchDTO paymentMethodSearchDTO);
	
	List<PaymentMethodDTO> convertPaymentMethodsToPaymentMethodDTOs(List<PaymentMethod> paymentMethods, PaymentMethodConvertCriteriaDTO convertCriteria);

	PaymentMethodDTO getPaymentMethodDTOById(Integer paymentMethodId);







}





