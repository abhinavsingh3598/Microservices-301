package com.mindtree.searchService.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter@Setter
public class UserRequestDto {

	private int userId;
	private String userName;
	private String email;
	private String userType;

}
