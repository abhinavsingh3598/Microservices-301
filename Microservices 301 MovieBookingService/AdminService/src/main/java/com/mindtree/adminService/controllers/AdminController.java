package com.mindtree.adminService.controllers;

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

import com.mindtree.adminService.dtos.CastCrewRequestDto;
import com.mindtree.adminService.dtos.GenreRequestDto;
import com.mindtree.adminService.dtos.ListRequestBody;
import com.mindtree.adminService.dtos.MovieRequestDto;
import com.mindtree.adminService.dtos.MovieSearchResponseDto;
import com.mindtree.adminService.dtos.ScreenRequestDto;
import com.mindtree.adminService.dtos.ScreenResponseDto;
import com.mindtree.adminService.dtos.ShowScreenDetailsRequestDto;
import com.mindtree.adminService.dtos.ShowScreenDetailsResponseDto;
import com.mindtree.adminService.dtos.ShowScreenSeatUpdatedRequestDto;
import com.mindtree.adminService.dtos.ShowTimingsRequestDto;
import com.mindtree.adminService.dtos.TheaterRequestDto;
import com.mindtree.adminService.exceptions.ServiceException;
import com.mindtree.adminService.services.AdminService;
import com.mindtree.adminService.utilities.ApiResponse;

@RestController
public class AdminController {

	@Autowired
	AdminService adminService; 
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE ,path = "/genre")
	public ResponseEntity<ApiResponse<GenreRequestDto>> addGenre(@RequestBody GenreRequestDto genreRequestDto)
	{
		
		ApiResponse<GenreRequestDto> apiResponse = new ApiResponse<>();
		apiResponse.setBody(adminService.addGenreToDB(genreRequestDto));
		apiResponse.setMessage("Genre Added Sucessfully !!");
		apiResponse.setError(false);
		apiResponse.setStatus(HttpStatus.CREATED);
		return ResponseEntity.status(HttpStatus.CREATED).body(apiResponse);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE ,path = "/movie")
	public ResponseEntity<ApiResponse<MovieRequestDto>> addMovie(@RequestBody MovieRequestDto movieRequestDto)
	{
		
		ApiResponse<MovieRequestDto> apiResponse = new ApiResponse<>();
		apiResponse.setBody(adminService.addMovieToDB(movieRequestDto));
		apiResponse.setMessage("Movie Added Sucessfully !!");
		apiResponse.setError(false);
		apiResponse.setStatus(HttpStatus.CREATED);
		return ResponseEntity.status(HttpStatus.CREATED).body(apiResponse);
	}

	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE ,path = "/castcrew")
	public ResponseEntity<ApiResponse<CastCrewRequestDto>> addCastCrew(@RequestBody CastCrewRequestDto castCrewRequestDto)
	{
		
		ApiResponse<CastCrewRequestDto> apiResponse = new ApiResponse<>();
		apiResponse.setBody(adminService.addCastCrewToDB(castCrewRequestDto));
		apiResponse.setMessage("Cast Crew  Added Sucessfully !!");
		apiResponse.setError(false);
		apiResponse.setStatus(HttpStatus.CREATED);
		return ResponseEntity.status(HttpStatus.CREATED).body(apiResponse);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE ,path = "/theater")
	public ResponseEntity<ApiResponse<TheaterRequestDto>> addTheater(@RequestBody TheaterRequestDto theaterRequestDto)
	{
		
		ApiResponse<TheaterRequestDto> apiResponse = new ApiResponse<>();
		apiResponse.setBody(adminService.addTheaterToDB(theaterRequestDto));
		apiResponse.setMessage("Theater  Added Sucessfully !!");
		apiResponse.setError(false);
		apiResponse.setStatus(HttpStatus.CREATED);
		return ResponseEntity.status(HttpStatus.CREATED).body(apiResponse);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE ,path = "/screen/{theaterId}")
	public ResponseEntity<ApiResponse<ScreenResponseDto>> addScreenToTheater(@RequestBody ScreenRequestDto screenRequestDto,@PathVariable int 
			theaterId) throws ServiceException
	{
		
		ApiResponse<ScreenResponseDto> apiResponse = new ApiResponse<>();
		apiResponse.setBody(adminService.addScreenToDB(screenRequestDto,theaterId));
		apiResponse.setMessage("Screen Added Sucessfully to Theater !!");
		apiResponse.setError(false);
		apiResponse.setStatus(HttpStatus.CREATED);
		return ResponseEntity.status(HttpStatus.CREATED).body(apiResponse);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE ,path = "/showScreenDetails")
	public ResponseEntity<ApiResponse<ShowScreenDetailsResponseDto>> addShowScreenDetails(@RequestBody ShowScreenDetailsRequestDto showScreenDetailsRequestDto) throws ServiceException
	{
		
		ApiResponse<ShowScreenDetailsResponseDto> apiResponse = new ApiResponse<>();
		apiResponse.setBody(adminService.addShowScreenDetailsDB(showScreenDetailsRequestDto));
		apiResponse.setMessage("Show Screen Details Added Sucessfully !!");
		apiResponse.setError(false);
		apiResponse.setStatus(HttpStatus.CREATED);
		return ResponseEntity.status(HttpStatus.CREATED).body(apiResponse);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE ,path = "/showTimings")
	public ResponseEntity<ApiResponse<ShowTimingsRequestDto>> addShowScreenTimings(@RequestBody ShowTimingsRequestDto showTimingsRequestDto)
	{
		
		ApiResponse<ShowTimingsRequestDto> apiResponse = new ApiResponse<>();
		apiResponse.setBody(adminService.addShowTimingsDB(showTimingsRequestDto));
		apiResponse.setMessage("Show Timings Added Sucessfully !!");
		apiResponse.setError(false);
		apiResponse.setStatus(HttpStatus.CREATED);
		return ResponseEntity.status(HttpStatus.CREATED).body(apiResponse);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE ,path = "/movieCastCrew/{movieId}")
	public ResponseEntity<ApiResponse<String>> assignCastCrewToMovie(@RequestBody ListRequestBody castCrewIds,@PathVariable int 
			movieId) throws ServiceException
	{
		
		ApiResponse<String> apiResponse = new ApiResponse<>();
		apiResponse.setBody(adminService.addCastCrewToMovie(castCrewIds,movieId));
		apiResponse.setMessage("Cast and Crew Added Sucessfully to Movie !!");
		apiResponse.setError(false);
		apiResponse.setStatus(HttpStatus.ACCEPTED);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(apiResponse);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE ,path = "/movieGenre/{movieId}")
	public ResponseEntity<ApiResponse<String>> assignGenreToMovie(@RequestBody ListRequestBody genreIds,@PathVariable int 
			movieId) throws ServiceException
	{
		
		ApiResponse<String> apiResponse = new ApiResponse<>();
		apiResponse.setBody(adminService.addGenreToMovieToDB(genreIds,movieId));
		apiResponse.setMessage("Genre Added Sucessfully to Movie !!");
		apiResponse.setError(false);
		apiResponse.setStatus(HttpStatus.ACCEPTED);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(apiResponse);
	}
	
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE ,path = "/showScreenDetailsSeatUpdate")
	public ResponseEntity<ApiResponse<String>> updatedShowScreenSeatsDetails(@RequestBody ShowScreenSeatUpdatedRequestDto screenSeatUpdatedRequestDto ) throws ServiceException
	{
		
		ApiResponse<String> apiResponse = new ApiResponse<>();
		apiResponse.setBody(adminService.updateShowScreenDetailsSeats(screenSeatUpdatedRequestDto));
		apiResponse.setMessage("Updated Show Screen Details !!");
		apiResponse.setError(false);
		apiResponse.setStatus(HttpStatus.ACCEPTED);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(apiResponse);
	}
	
	@RequestMapping(method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE ,path = "/getAllMovies")
	public ResponseEntity<ApiResponse<List<MovieSearchResponseDto>>> getAllMovies() throws ServiceException
	{
		
		ApiResponse<List<MovieSearchResponseDto>> apiResponse = new ApiResponse<>();
		apiResponse.setBody(adminService.getAllMoviesFromDB());
		apiResponse.setMessage("All Movies List !!");
		apiResponse.setError(false);
		apiResponse.setStatus(HttpStatus.OK);
		return ResponseEntity.status(HttpStatus.OK).body(apiResponse);
	}
	
	@RequestMapping(method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE ,path = "/getAllTheaters")
	public ResponseEntity<ApiResponse<List<TheaterRequestDto>>> getAllTheaters() throws ServiceException
	{
		
		ApiResponse<List<TheaterRequestDto>> apiResponse = new ApiResponse<>();
		apiResponse.setBody(adminService.getAllTheatersFromDB());
		apiResponse.setMessage("All Theater List !!");
		apiResponse.setError(false);
		apiResponse.setStatus(HttpStatus.OK);
		return ResponseEntity.status(HttpStatus.OK).body(apiResponse);
	}
	
	
	@RequestMapping(method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE ,path = "/getShowScreenDetails")
	public ResponseEntity<ApiResponse<List<ShowScreenDetailsResponseDto>>> getShowScreenDetails() throws ServiceException
	{
		
		ApiResponse<List<ShowScreenDetailsResponseDto>> apiResponse = new ApiResponse<>();
		apiResponse.setBody(adminService.getShowScreenDetailsFromDB());
		apiResponse.setMessage("All ShowScreenDetails List !!");
		apiResponse.setError(false);
		apiResponse.setStatus(HttpStatus.OK);
		return ResponseEntity.status(HttpStatus.OK).body(apiResponse);
	}
	
	@RequestMapping(method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE ,path = "/verifyGenre/{genreId}")
	public ResponseEntity<ApiResponse<Boolean>> validateGenre(@PathVariable int genreId) throws ServiceException
	{
		
		ApiResponse<Boolean> apiResponse = new ApiResponse<>();
		apiResponse.setBody(adminService.validateGenreInDB(genreId));
		apiResponse.setMessage("Verified Genre!!");
		apiResponse.setError(false);
		apiResponse.setStatus(HttpStatus.OK);
		return ResponseEntity.status(HttpStatus.OK).body(apiResponse);
	}
	
	@RequestMapping(method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE ,path = "/showScreenBookedSeatInfo/{showScreenId}")
	public ResponseEntity<ApiResponse<ShowScreenSeatUpdatedRequestDto>> getBookedSeatInfoShowScreen(@PathVariable int showScreenId) throws ServiceException
	{
		
		ApiResponse<ShowScreenSeatUpdatedRequestDto> apiResponse = new ApiResponse<>();
		apiResponse.setBody(adminService.getBookedSeatInfoShowScreenFromDB(showScreenId));
		apiResponse.setMessage("Booked Seat info!!");
		apiResponse.setError(false);
		apiResponse.setStatus(HttpStatus.OK);
		return ResponseEntity.status(HttpStatus.OK).body(apiResponse);
	}
	
}
