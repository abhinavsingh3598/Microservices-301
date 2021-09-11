package com.mindtree.searchService.configs;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mindtree.searchService.dtos.PreferenceResponseDTO;
import com.mindtree.searchService.dtos.UserRequestDto;
import com.mindtree.searchService.exceptions.ServiceException;
import com.mindtree.searchService.utilities.ApiResponse;



@FeignClient(name="user-service")
public interface ExternalUserService {

	@RequestMapping(method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE ,path = "/getAllUsers")
	ResponseEntity<ApiResponse<List<UserRequestDto>>> getAllUsersFromDB();
	
	@RequestMapping(method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE ,path = "/getPreference/{preferenceId}")
	ResponseEntity<ApiResponse<PreferenceResponseDTO>> getPreferenceByIDFromDB(@PathVariable int preferenceId) throws ServiceException ;
}
