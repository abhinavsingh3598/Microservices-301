package com.mindtree.userService.configs;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mindtree.userService.utilities.ApiResponse;

@FeignClient(name = "search-service")
public interface ExternalSearchService {

	@RequestMapping(method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, path = "/movieIdValidate/{movieId}")
	ResponseEntity<ApiResponse<Boolean>> validateMovieIdFromDB(@PathVariable("movieId") int movieId);
	
}
