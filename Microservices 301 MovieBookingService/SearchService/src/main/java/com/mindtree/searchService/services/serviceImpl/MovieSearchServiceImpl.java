package com.mindtree.searchService.services.serviceImpl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.searchService.configs.ExternalAdminServices;
import com.mindtree.searchService.configs.ExternalBookingService;
import com.mindtree.searchService.configs.ExternalUserService;
import com.mindtree.searchService.dtos.BookingRequestDto;
import com.mindtree.searchService.dtos.MovieSearchResponseDto;
import com.mindtree.searchService.dtos.PreferenceResponseDTO;
import com.mindtree.searchService.dtos.ShowScreenDetailsResponseDto;
import com.mindtree.searchService.exceptions.MovieDoesntExist;
import com.mindtree.searchService.exceptions.PreferenceIDInvalid;
import com.mindtree.searchService.exceptions.ServiceException;
import com.mindtree.searchService.services.MovieSearchService;

@Service
public class MovieSearchServiceImpl implements MovieSearchService {

	@Autowired
	ExternalAdminServices externalAdminService;

	@Autowired
	ExternalUserService externalUserService;

	@Autowired
	ExternalBookingService externalBookingService;

	@Override
	public Set<MovieSearchResponseDto> getMovieListByCity(String cityName) {
		Set<MovieSearchResponseDto> movieSearchResponseDtos = new HashSet<>();
		for (ShowScreenDetailsResponseDto detailsResponseDto : externalAdminService.getShowScreenDetailsFromDB()
				.getBody().getBody()) {
			if (detailsResponseDto.getTheater().getAddress().getCity().equals(cityName)) {
				movieSearchResponseDtos.add(detailsResponseDto.getMovie());
			}
		}

		return movieSearchResponseDtos;
	}

	@Override
	public List<MovieSearchResponseDto> getMovieListByLanguage(String language) throws ServiceException {

		List<MovieSearchResponseDto> movieList = getMovieList().stream().filter(m -> m.getLanguage().equals(language))
				.collect(Collectors.toList());
		if (movieList.isEmpty()) {
			throw new MovieDoesntExist("No Movie Exist with this language ");
		}

		return movieList;
	}

	private List<MovieSearchResponseDto> getMovieList() {
		return externalAdminService.getAllMoviesFromDB().getBody().getBody();
	}

	@Override
	public List<MovieSearchResponseDto> getMovieListByGenre(String genreType) throws ServiceException {

		List<MovieSearchResponseDto> movieList = getMovieList().stream()
				.filter(movie -> movie.getGenres().stream().anyMatch(g -> g.getGenreType().equals(genreType)))
				.collect(Collectors.toList());
		if (movieList.isEmpty()) {
			throw new MovieDoesntExist("No Movie Exist with this GenreType ");
		}
		return movieList;
	}

	@Override
	public List<MovieSearchResponseDto> getMovieListByPreference(int preferenceId) throws ServiceException {

		PreferenceResponseDTO preferenceResponseDTO = externalUserService.getPreferenceByIDFromDB(preferenceId)
				.getBody().getBody();

		if (preferenceResponseDTO == null) {
			throw new PreferenceIDInvalid("Preference Id doesnt exist");
		}

		return getMovieList().stream()
				.filter(m -> m.getLanguage().equals(preferenceResponseDTO.getLanguage())
						&& m.getGenres().stream().anyMatch(g -> g.getGenreId() == preferenceResponseDTO.getGenreId()))
				.collect(Collectors.toList());
	}

	@Override
	public Set<MovieSearchResponseDto> getPreviousBookedMovieByUser(int userId) {
		Set<MovieSearchResponseDto> movieSearchResponseDtos = new HashSet<>();

		for (BookingRequestDto booking : externalBookingService.getAllBookingFromDB().getBody().getBody()) {
			if (booking.getUserId() == userId) {
				for (ShowScreenDetailsResponseDto detailsResponseDto : externalAdminService.getShowScreenDetailsFromDB()
						.getBody().getBody()) {
					if (detailsResponseDto.getShowScreenDetailId() == booking.getShow_screenId()) {

						movieSearchResponseDtos.add(detailsResponseDto.getMovie());
					}
				}

			}
		}
		return movieSearchResponseDtos;
	}



	@Override
	public Boolean validateMovieFromDB(String movieName) {
		return getMovieList().stream().anyMatch(m -> m.getMovieName().equals(movieName));
	}

	@Override
	public Boolean validateMovieIdFromDB(int movieId) {
		return getMovieList().stream().anyMatch(m -> m.getMovieId() == movieId);
	}

}
