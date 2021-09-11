package com.mindtree.searchService.services;

import java.util.List;
import java.util.Set;

import com.mindtree.searchService.dtos.MovieSearchResponseDto;
import com.mindtree.searchService.exceptions.ServiceException;

public interface MovieSearchService {

	Set<MovieSearchResponseDto> getMovieListByCity(String cityName);

	List<MovieSearchResponseDto> getMovieListByLanguage(String language) throws ServiceException;

	List<MovieSearchResponseDto> getMovieListByGenre(String genreType) throws ServiceException;

	List<MovieSearchResponseDto> getMovieListByPreference(int preferenceId) throws ServiceException;

	Set<MovieSearchResponseDto> getPreviousBookedMovieByUser(int userId);

	Boolean validateMovieFromDB(String movieName);

	Boolean validateMovieIdFromDB(int movieId);

	

	
}
