package com.mindtree.searchService.dtos;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

//@Setter@Getter
@NoArgsConstructor
@Data

public class MovieSearchResponseDto {

	private int movieId;
	private String movieName;
	private String moviePoster;
	private String movieDescription;
	private String budget;
	private String releaseDate;
	private String interestingfacts;
	private String language;
	@EqualsAndHashCode.Exclude private Set<CastCrewRequestDto> movieCastCrews;
	@EqualsAndHashCode.Exclude private Set<GenreRequestDto> genres;
	@JsonIgnore
	@EqualsAndHashCode.Exclude private Set<ShowScreenDetailsRequestDto> showScreenDetails;
}
