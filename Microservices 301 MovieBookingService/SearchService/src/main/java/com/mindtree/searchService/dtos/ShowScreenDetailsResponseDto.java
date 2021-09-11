package com.mindtree.searchService.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@NoArgsConstructor
public class ShowScreenDetailsResponseDto {


	private int showScreenDetailId;

	private ShowTimingsRequestDto show;

	private ScreenRequestDto screen;

	private MovieSearchResponseDto movie;

	private TheaterRequestDto theater;

	private int totalSeatsPresent;
	
	private String[] bookedSeats;
}