package com.mindtree.userService.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@NoArgsConstructor
public class ReviewResponseDto {

	private int reviewId;
	private double rating;
	private String reviewDescription;
	private int movieId;
	private UserResponseDto user;

}
