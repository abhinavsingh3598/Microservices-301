package com.mindtree.searchService.services.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.searchService.configs.ExternalAdminServices;
import com.mindtree.searchService.services.TheaterSearchService;

@Service
public class TheaterSearchServiceImpl implements TheaterSearchService {

	@Autowired
	ExternalAdminServices externalAdminServices;

	@Override
	public Boolean validateTheaterFromDB(String theaterName) {
		return externalAdminServices.getAllTheatersFromDB().getBody().getBody().stream()
				.anyMatch(theater -> theater.getTheaterName().equals(theaterName));
	}

}
