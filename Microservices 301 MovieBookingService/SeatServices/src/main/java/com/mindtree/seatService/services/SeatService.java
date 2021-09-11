package com.mindtree.seatService.services;

import com.mindtree.seatService.exceptions.ServiceException;

public interface SeatService {

	Boolean getAllBookedSeatsFromAdminService(int showScreenDetailsId) throws ServiceException;

}
