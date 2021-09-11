package com.mindtree.bookingService.dtos;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@NoArgsConstructor
public class ShowScreenSeatUpdatedRequestDto {

	private int showScreenDetailId;
	
	private List<String> bookedSeats;

}
