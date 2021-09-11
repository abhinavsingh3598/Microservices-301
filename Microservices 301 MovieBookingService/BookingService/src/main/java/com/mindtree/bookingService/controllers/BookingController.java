package com.mindtree.bookingService.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.bookingService.dtos.BookingRequestDto;
import com.mindtree.bookingService.exceptions.ServiceException;
import com.mindtree.bookingService.services.BookingService;
import com.mindtree.bookingService.utilities.ApiResponse;

@RestController
public class BookingController {

@Autowired
BookingService bookingService;

@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE ,path = "/registerBooking")
public ResponseEntity<ApiResponse<BookingRequestDto>> registerUser(@RequestBody BookingRequestDto bookingRequestDto) throws ServiceException
{
	
	ApiResponse<BookingRequestDto> apiResponse = new ApiResponse<>();
	apiResponse.setBody(bookingService.addBookingToDB(bookingRequestDto));
	apiResponse.setMessage("Booking Added Sucessfully !!");
	apiResponse.setError(false);
	apiResponse.setStatus(HttpStatus.CREATED);
	return ResponseEntity.status(HttpStatus.CREATED).body(apiResponse);
}

@RequestMapping(method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE ,path = "/booking/{bookingId}")
public ResponseEntity<ApiResponse<String>> cancelBooking(@PathVariable int bookingId) throws ServiceException
{
	
	ApiResponse<String> apiResponse = new ApiResponse<>();
	apiResponse.setBody(bookingService.deleteBookingFromDB(bookingId));
	apiResponse.setMessage("Booking Cancel Sucessfully !!");
	apiResponse.setError(false);
	apiResponse.setStatus(HttpStatus.OK);
	return ResponseEntity.status(HttpStatus.OK).body(apiResponse);
}

@RequestMapping(method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE ,path = "/bookingDetails")
public ResponseEntity<ApiResponse<List<BookingRequestDto>>> getAllBooking()
{
	
	ApiResponse<List<BookingRequestDto>> apiResponse = new ApiResponse<>();
	apiResponse.setBody(bookingService.getAllBookingFromDB());
	apiResponse.setMessage("Booking Details !!");
	apiResponse.setError(false);
	apiResponse.setStatus(HttpStatus.OK);
	return ResponseEntity.status(HttpStatus.OK).body(apiResponse);
}

}
