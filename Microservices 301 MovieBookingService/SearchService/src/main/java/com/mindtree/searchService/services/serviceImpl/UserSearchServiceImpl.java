package com.mindtree.searchService.services.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.searchService.configs.ExternalUserService;
import com.mindtree.searchService.services.UserSearchService;

@Service
public class UserSearchServiceImpl implements UserSearchService {

	@Autowired
	ExternalUserService externalUserService;

	@Override
	public Boolean validateUserFromDB(int userId) {
		return externalUserService.getAllUsersFromDB().getBody().getBody().stream()
				.anyMatch(user -> user.getUserId() == userId);
	}

}
