package com.mindtree.userService.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter@Setter
public class PreferenceRequestDto {

	private String language;
	private int genreId;
	
}
