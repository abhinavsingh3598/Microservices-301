package com.mindtree.searchService.configs;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mindtree.searchService.dtos.BookingRequestDto;
import com.mindtree.searchService.utilities.ApiResponse;

@FeignClient(name = "booking-service")
public interface ExternalBookingService {

	@RequestMapping(method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, path = "/bookingDetails")
	ResponseEntity<ApiResponse<List<BookingRequestDto>>> getAllBookingFromDB();

}
