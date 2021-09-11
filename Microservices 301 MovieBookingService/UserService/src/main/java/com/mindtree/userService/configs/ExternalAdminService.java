package com.mindtree.userService.configs;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mindtree.userService.utilities.ApiResponse;

@FeignClient(name = "admin-service")
public interface ExternalAdminService {

	@RequestMapping(method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, path = "/verifyGenre/{genreId}")
	ResponseEntity<ApiResponse<Boolean>> validateGenreInDB(@PathVariable("genreId") int genreId);
}
