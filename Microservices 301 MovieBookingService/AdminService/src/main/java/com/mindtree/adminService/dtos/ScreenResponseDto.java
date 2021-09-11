package com.mindtree.adminService.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@NoArgsConstructor
public class ScreenResponseDto {

	private int screenId;
	private String screenName;
	private int capacity;
	private TheaterRequestDto screenTheater;

}
