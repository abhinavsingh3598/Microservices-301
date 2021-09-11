package com.mindtree.adminService.dtos;

import java.util.Set;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter@Getter
@NoArgsConstructor
public class MovieSearchResponseDto {

	private int movieId;
	private String movieName;
	private String moviePoster;
	private String movieDescription;
	private String budget;
	private String releaseDate;
	private String interestingfacts;
	private String language;
	private Set<CastCrewRequestDto> movieCastCrews;
	private Set<GenreRequestDto> genres;
	private Set<ShowScreenDetailsRequestDto> showScreenDetails;
}
