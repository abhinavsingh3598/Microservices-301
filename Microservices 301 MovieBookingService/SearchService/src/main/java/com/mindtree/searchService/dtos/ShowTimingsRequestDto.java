package com.mindtree.searchService.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter@Getter
@NoArgsConstructor
public class ShowTimingsRequestDto {

	private int showId;
	
	private String showTimings;
	
}
