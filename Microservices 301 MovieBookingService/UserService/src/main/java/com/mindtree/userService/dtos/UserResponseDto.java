package com.mindtree.userService.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@NoArgsConstructor
public class UserResponseDto {

	private int userId;
	private String userName;
	private String email;
	private String userType;
	private PreferenceRequestDto preference;
}
