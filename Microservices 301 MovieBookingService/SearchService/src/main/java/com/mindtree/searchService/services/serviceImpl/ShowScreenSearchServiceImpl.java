package com.mindtree.searchService.services.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.searchService.configs.ExternalAdminServices;
import com.mindtree.searchService.services.ShowScreenSearchService;

@Service
public class ShowScreenSearchServiceImpl implements ShowScreenSearchService {

	@Autowired
	ExternalAdminServices externalAdminServices;

	@Override
	public Boolean validateShowScreenDetailsFromDB(int showScreenDetailsId) {
		return externalAdminServices.getShowScreenDetailsFromDB().getBody().getBody().stream()
				.anyMatch(ss -> ss.getShowScreenDetailId() == showScreenDetailsId);
	}

}
