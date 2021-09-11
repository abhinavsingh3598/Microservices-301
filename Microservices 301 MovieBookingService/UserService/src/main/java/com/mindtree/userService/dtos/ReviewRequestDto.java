package com.mindtree.userService.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter@Getter
public class ReviewRequestDto {

	private int reviewId;
	private double rating;
	private String reviewDescription;
	private int movieId;

}
