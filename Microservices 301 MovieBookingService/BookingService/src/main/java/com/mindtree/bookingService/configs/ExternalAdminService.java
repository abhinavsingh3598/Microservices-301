package com.mindtree.bookingService.configs;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mindtree.bookingService.dtos.ShowScreenSeatUpdatedRequestDto;
import com.mindtree.bookingService.exceptions.ServiceException;
import com.mindtree.bookingService.utilities.ApiResponse;

@FeignClient(name = "admin-service")
public interface ExternalAdminService {

	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, path = "/showScreenDetailsSeatUpdate")
	public ResponseEntity<ApiResponse<String>> updatedShowScreenSeatsDetails(
			@RequestBody ShowScreenSeatUpdatedRequestDto screenSeatUpdatedRequestDto) throws ServiceException;

}
