package com.mindtree.searchService.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@NoArgsConstructor
public class ShowScreenSeatUpdatedRequestDto {

	private int showScreenDetailId;
	
	private String[] bookedSeats;

}
