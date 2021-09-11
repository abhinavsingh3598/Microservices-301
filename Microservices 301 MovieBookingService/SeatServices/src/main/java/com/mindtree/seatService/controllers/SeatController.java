package com.mindtree.seatService.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.seatService.exceptions.ServiceException;
import com.mindtree.seatService.services.SeatService;
import com.mindtree.seatService.utilities.ApiResponse;

@RestController
public class SeatController {

	@Autowired
	SeatService seatService;

//	@RequestMapping(method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, path = "/seatAvailable/{showScreenDetailsId}")
//	public ResponseEntity<ApiResponse<Boolean>> getAllBookedSeats(@PathVariable int showScreenDetailsId)
//			throws ServiceException {
//
//		ApiResponse<Boolean> apiResponse = new ApiResponse<>();
//		apiResponse.setBody(seatService.getAllBookedSeatsFromAdminService(showScreenDetailsId));
//		apiResponse.setMessage("Seat Information Searched Sucessfully !!");
//		apiResponse.setError(false);
//		apiResponse.setStatus(HttpStatus.FOUND);
//		return ResponseEntity.status(HttpStatus.FOUND).body(apiResponse);
//	}
	
	
//	@RequestMapping(method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE ,path = "/movieIdValidate/{movieId}")
//	public ResponseEntity<ApiResponse<Boolean>> validateMovieIDExist(@PathVariable int movieId )
//	{
//		
//		ApiResponse<Boolean> apiResponse = new ApiResponse<>();
//		apiResponse.setBody(movieSearchService.validateMovieIdFromDB(movieId));
//		apiResponse.setMessage("Movie Validated!!");
//		apiResponse.setError(false);
//		apiResponse.setStatus(HttpStatus.OK);
//		return ResponseEntity.status(HttpStatus.OK).body(apiResponse);
//	}
	
	
	@RequestMapping(method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, path = "/seatAvailable/{showScreenDetailsId}")
	public boolean getAllBookedSeats(@PathVariable int showScreenDetailsId)
			throws ServiceException {

		return seatService.getAllBookedSeatsFromAdminService(showScreenDetailsId);
	}

}
