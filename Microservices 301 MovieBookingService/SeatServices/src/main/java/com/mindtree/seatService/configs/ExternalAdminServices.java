package com.mindtree.seatService.configs;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mindtree.seatService.dtos.ShowScreenSeatUpdatedRequestDto;
import com.mindtree.seatService.exceptions.ServiceException;
import com.mindtree.seatService.utilities.ApiResponse;

@FeignClient(name = "admin-service")
public interface ExternalAdminServices {

	@RequestMapping(method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, path = "/showScreenBookedSeatInfo/{showScreenId}")
	public ResponseEntity<ApiResponse<ShowScreenSeatUpdatedRequestDto>> getBookedSeatInfoShowScreen(
			@PathVariable int showScreenId) throws ServiceException;
}
