package com.mindtree.searchService.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class ScreenRequestDto {

	private int screenId;
	private String screenName;
	private int capacity;
	private TheaterRequestDto screenTheater;
}
