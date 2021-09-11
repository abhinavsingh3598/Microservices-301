package com.mindtree.bookingService.configs;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mindtree.bookingService.utilities.ApiResponse;

@FeignClient(name = "search-service")
public interface ExternalSearchService {

	@RequestMapping(method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, path = "/userIdValidate/{userId}")
	ResponseEntity<ApiResponse<Boolean>> validateUserFromDB(@PathVariable int userId);
	
	@RequestMapping(method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE ,path = "/showScreenDetailsValidate/{showScreenDetailsId}")
	ResponseEntity<ApiResponse<Boolean>> validateShowScreenDetailsFromDB(@PathVariable int showScreenDetailsId);
	
	@RequestMapping(method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE ,path = "/movieNameValidate/{movieName}")
	ResponseEntity<ApiResponse<Boolean>> validateMovieFromDB(@PathVariable String movieName);
	
	@RequestMapping(method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE ,path = "/theaterNameValidate/{theaterName}")
	ResponseEntity<ApiResponse<Boolean>> validateTheaterFromDB(@PathVariable String theaterName);
	
}
