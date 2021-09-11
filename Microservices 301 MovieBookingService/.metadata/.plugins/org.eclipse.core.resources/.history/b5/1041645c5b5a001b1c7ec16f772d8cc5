package com.mindtree.userService.dtos;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@NoArgsConstructor
public class PreferenceResponseDTO {

	private int preferenceId;
	private String language;
	private int genreId;
	
	@JsonIgnore
	private Set<UserRequestDto> users;

}
