package com.mindtree.adminService.services;

import java.util.List;

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

public interface AdminService {

	GenreRequestDto addGenreToDB(GenreRequestDto genreRequestDto);

	MovieRequestDto addMovieToDB(MovieRequestDto movieRequestDto);

	CastCrewRequestDto addCastCrewToDB(CastCrewRequestDto castCrewRequestDto);

	TheaterRequestDto addTheaterToDB(TheaterRequestDto theaterRequestDto);

	ScreenResponseDto addScreenToDB(ScreenRequestDto screenRequestDto, int theaterId) throws ServiceException;

	ShowScreenDetailsResponseDto addShowScreenDetailsDB(ShowScreenDetailsRequestDto showScreenDetailsRequestDto) throws ServiceException;

	ShowTimingsRequestDto addShowTimingsDB(ShowTimingsRequestDto showTimingsRequestDto);

	String addCastCrewToMovie(ListRequestBody movieCastCrewRequestDto, int movieId) throws ServiceException;

	String addGenreToMovieToDB(ListRequestBody genreIds, int movieId) throws ServiceException;

	String updateShowScreenDetailsSeats(ShowScreenSeatUpdatedRequestDto screenSeatUpdatedRequestDto) throws ServiceException;

	List<MovieSearchResponseDto> getAllMoviesFromDB();

	List<TheaterRequestDto> getAllTheatersFromDB();

	List<ShowScreenDetailsResponseDto> getShowScreenDetailsFromDB();

	Boolean validateGenreInDB(int genreId);

	ShowScreenSeatUpdatedRequestDto getBookedSeatInfoShowScreenFromDB(int showScreenId) throws ServiceException;

}
