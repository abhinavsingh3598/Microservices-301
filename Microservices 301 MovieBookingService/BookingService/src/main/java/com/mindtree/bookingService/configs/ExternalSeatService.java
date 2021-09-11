package com.mindtree.bookingService.configs;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mindtree.bookingService.exceptions.ServiceException;
import com.mindtree.bookingService.utilities.ApiResponse;

@FeignClient(name = "seat-service")
public interface ExternalSeatService {

	@RequestMapping(method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, path = "/seatAvailable/{showScreenDetailsId}")
//	 ResponseEntity<ApiResponse<Boolean>> getAllBookedSeatsFromAdminService(@PathVariable int showScreenDetailsId)
//			throws ServiceException;
	public boolean getAllBookedSeatsFromAdminService(@PathVariable int showScreenDetailsId)
			throws ServiceException;
	
}