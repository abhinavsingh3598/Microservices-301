package com.mindtree.userService.services;

import java.util.List;

import com.mindtree.userService.dtos.PreferenceRequestDto;
import com.mindtree.userService.dtos.PreferenceResponseDTO;
import com.mindtree.userService.dtos.ReviewRequestDto;
import com.mindtree.userService.dtos.ReviewResponseDto;
import com.mindtree.userService.dtos.UserRequestDto;
import com.mindtree.userService.dtos.UserResponseDto;
import com.mindtree.userService.exceptions.ServiceException;

public interface UserService {

	UserResponseDto addUserToDB(UserRequestDto userRequestDto);

	PreferenceResponseDTO addPreferenceToDB(PreferenceRequestDto preferenceRequestDto) throws ServiceException;

	ReviewResponseDto addReviewToDB(ReviewRequestDto reviewRequestDto, int userId) throws ServiceException;

	String assignPreferenceToUser(int userId, int preferenceId) throws ServiceException;

	UserResponseDto updateUserDetailsToDB(UserRequestDto userRequestDto, int userId) throws ServiceException;

	List<UserResponseDto> getAllUsersFromDB();

	PreferenceResponseDTO getPreferenceByIDFromDB(int preferenceId) throws ServiceException;

}
