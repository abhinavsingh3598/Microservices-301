package com.mindtree.seatService.services.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.seatService.configs.ExternalAdminServices;
import com.mindtree.seatService.dtos.ShowScreenSeatUpdatedRequestDto;
import com.mindtree.seatService.exceptions.ServiceException;
import com.mindtree.seatService.exceptions.ShowScreenDetailsIDInvalid;
import com.mindtree.seatService.services.SeatService;

@Service
public class SeatServiceImpl implements SeatService {

	@Autowired
	ExternalAdminServices externalAdminService;

	@Override
	public Boolean getAllBookedSeatsFromAdminService(int showScreenDetailsId) throws ServiceException {
		ShowScreenSeatUpdatedRequestDto showScreen = null;
		try {
			showScreen = externalAdminService.getBookedSeatInfoShowScreen(showScreenDetailsId).getBody().getBody();

		} catch (Exception e) {
			throw new ShowScreenDetailsIDInvalid("id is not valid", e);
		}
		return showScreen.getBookedSeats().size() < showScreen.getScreenCapacity();
	}

}
