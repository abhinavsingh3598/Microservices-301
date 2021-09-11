package com.mindtree.searchService.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class MovieRequestDto {

	
	private int movieId;
	private String movieName;
	private String moviePoster;
	private String movieDescription;
	private String budget;
	private String releaseDate;
	private String interestingfacts;
	private String language;

}
