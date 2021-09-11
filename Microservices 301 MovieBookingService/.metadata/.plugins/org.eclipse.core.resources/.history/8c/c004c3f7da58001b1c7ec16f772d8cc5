package com.mindtree.searchService.dtos;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@NoArgsConstructor
@EqualsAndHashCode(exclude="screens")
public class TheaterRequestDto {

	private int theaterId;
	private String theaterName;
	private String restrictions;
	private AddressRequestDto address;
	@JsonIgnore
	private Set<ScreenRequestDto> screens;
	
}
