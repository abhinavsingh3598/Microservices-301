package com.mindtree.searchService.controllers;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.searchService.dtos.MovieSearchResponseDto;
import com.mindtree.searchService.exceptions.ServiceException;
import com.mindtree.searchService.services.MovieSearchService;
import com.mindtree.searchService.services.ShowScreenSearchService;
import com.mindtree.searchService.services.TheaterSearchService;
import com.mindtree.searchService.services.UserSearchService;
import com.mindtree.searchService.utilities.ApiResponse;

@RestController
public class SearchController {
	
	@Autowired
	MovieSearchService movieSearchService;
	
	@Autowired
	TheaterSearchService theaterSearchService;
	
	@Autowired
	UserSearchService userSearchService;
	
	@Autowired
	ShowScreenSearchService showScreenSearchService;

	@RequestMapping(method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE ,path = "/movieSearch/{cityName}")
	public ResponseEntity<ApiResponse<Set<MovieSearchResponseDto>>> getMoviesByCityName(@PathVariable String cityName )
	{
		
		ApiResponse<Set<MovieSearchResponseDto>> apiResponse = new ApiResponse<>();
		apiResponse.setBody(movieSearchService.getMovieListByCity(cityName));
		apiResponse.setMessage("Movies Searched Sucessfully !!");
		apiResponse.setError(false);
		apiResponse.setStatus(HttpStatus.FOUND);
		return ResponseEntity.status(HttpStatus.FOUND).body(apiResponse);
	}
	
	@RequestMapping(method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE ,path = "/movielang/{language}")
	public ResponseEntity<ApiResponse<List<MovieSearchResponseDto>>> getMoviesByLanguage(@PathVariable String language ) throws ServiceException
	{
		
		ApiResponse<List<MovieSearchResponseDto>> apiResponse = new ApiResponse<>();
		apiResponse.setBody(movieSearchService.getMovieListByLanguage(language));
		apiResponse.setMessage("Movies Searched Sucessfully !!");
		apiResponse.setError(false);
		apiResponse.setStatus(HttpStatus.FOUND);
		return ResponseEntity.status(HttpStatus.FOUND).body(apiResponse);
	}
	
	@RequestMapping(method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE ,path = "/movieGenre/{genreType}")
	public ResponseEntity<ApiResponse<List<MovieSearchResponseDto>>> getMoviesByGenre(@PathVariable String genreType ) throws ServiceException
	{
		
		ApiResponse<List<MovieSearchResponseDto>> apiResponse = new ApiResponse<>();
		apiResponse.setBody(movieSearchService.getMovieListByGenre(genreType));
		apiResponse.setMessage("Movies Searched Sucessfully !!");
		apiResponse.setError(false);
		apiResponse.setStatus(HttpStatus.FOUND);
		return ResponseEntity.status(HttpStatus.FOUND).body(apiResponse);
	}
	
	@RequestMapping(method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE ,path = "/moviePreference/{preferenceId}")
	public ResponseEntity<ApiResponse<List<MovieSearchResponseDto>>> getMoviesByPreference(@PathVariable int preferenceId ) throws ServiceException
	{
		
		ApiResponse<List<MovieSearchResponseDto>> apiResponse = new ApiResponse<>();
		apiResponse.setBody(movieSearchService.getMovieListByPreference(preferenceId));
		apiResponse.setMessage("Movies Searched Sucessfully !!");
		apiResponse.setError(false);
		apiResponse.setStatus(HttpStatus.FOUND);
		return ResponseEntity.status(HttpStatus.FOUND).body(apiResponse);
	}
	
	@RequestMapping(method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE ,path = "/movieUser/{userId}")
	public ResponseEntity<ApiResponse<Set<MovieSearchResponseDto>>> getPreviousBookedMovie(@PathVariable int userId )
	{
		
		ApiResponse<Set<MovieSearchResponseDto>> apiResponse = new ApiResponse<>();
		apiResponse.setBody(movieSearchService.getPreviousBookedMovieByUser(userId));
		apiResponse.setMessage("Movies Searched Sucessfully !!");
		apiResponse.setError(false);
		apiResponse.setStatus(HttpStatus.FOUND);
		return ResponseEntity.status(HttpStatus.FOUND).body(apiResponse);
	}
	
	
	@RequestMapping(method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE ,path = "/movieNameValidate/{movieName}")
	public ResponseEntity<ApiResponse<Boolean>> validateMovieNameExist(@PathVariable String movieName )
	{
		
		ApiResponse<Boolean> apiResponse = new ApiResponse<>();
		apiResponse.setBody(movieSearchService.validateMovieFromDB(movieName));
		apiResponse.setMessage("Movie Validated!!");
		apiResponse.setError(false);
		apiResponse.setStatus(HttpStatus.OK);
		return ResponseEntity.status(HttpStatus.OK).body(apiResponse);
	}
	
	@RequestMapping(method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE ,path = "/movieIdValidate/{movieId}")
	public ResponseEntity<ApiResponse<Boolean>> validateMovieIDExist(@PathVariable int movieId )
	{
		
		ApiResponse<Boolean> apiResponse = new ApiResponse<>();
		apiResponse.setBody(movieSearchService.validateMovieIdFromDB(movieId));
		apiResponse.setMessage("Movie Validated!!");
		apiResponse.setError(false);
		apiResponse.setStatus(HttpStatus.OK);
		return ResponseEntity.status(HttpStatus.OK).body(apiResponse);
	}
	
	@RequestMapping(method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE ,path = "/theaterNameValidate/{theaterName}")
	public ResponseEntity<ApiResponse<Boolean>> validateTheaterNameExist(@PathVariable String theaterName )
	{
		
		ApiResponse<Boolean> apiResponse = new ApiResponse<>();
		apiResponse.setBody(theaterSearchService.validateTheaterFromDB(theaterName));
		apiResponse.setMessage("Theater Validated!!");
		apiResponse.setError(false);
		apiResponse.setStatus(HttpStatus.OK);
		return ResponseEntity.status(HttpStatus.OK).body(apiResponse);
	}
	
	@RequestMapping(method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE ,path = "/userIdValidate/{userId}")
	public ResponseEntity<ApiResponse<Boolean>> validateUserIdExist(@PathVariable int userId )
	{
		
		ApiResponse<Boolean> apiResponse = new ApiResponse<>();
		apiResponse.setBody(userSearchService.validateUserFromDB(userId));
		apiResponse.setMessage("User Validated!!");
		apiResponse.setError(false);
		apiResponse.setStatus(HttpStatus.OK);
		return ResponseEntity.status(HttpStatus.OK).body(apiResponse);
	}

	@RequestMapping(method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE ,path = "/showScreenDetailsValidate/{showScreenDetailsId}")
	public ResponseEntity<ApiResponse<Boolean>> validateShowScreenDetailsIdExist(@PathVariable int showScreenDetailsId )
	{
		
		ApiResponse<Boolean> apiResponse = new ApiResponse<>();
		apiResponse.setBody(showScreenSearchService.validateShowScreenDetailsFromDB(showScreenDetailsId));
		apiResponse.setMessage("ShowScreenDetails Id Validated!!");
		apiResponse.setError(false);
		apiResponse.setStatus(HttpStatus.OK);
		return ResponseEntity.status(HttpStatus.OK).body(apiResponse);
	}
	
}
