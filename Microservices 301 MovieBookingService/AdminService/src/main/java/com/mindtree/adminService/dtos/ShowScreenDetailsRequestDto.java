package com.mindtree.adminService.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class ShowScreenDetailsRequestDto {

	private int showId;

	private int screenId;

	private int movieId;

	private int theaterId;


}
