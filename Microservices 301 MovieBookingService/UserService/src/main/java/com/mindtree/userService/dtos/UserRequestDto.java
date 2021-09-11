package com.mindtree.userService.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter@Setter
public class UserRequestDto {


	private String userName;
	private String email;
	private String userType;
	
	
}
