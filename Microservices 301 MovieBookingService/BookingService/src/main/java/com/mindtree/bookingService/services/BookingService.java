package com.mindtree.bookingService.services;

import java.util.List;

import com.mindtree.bookingService.dtos.BookingRequestDto;
import com.mindtree.bookingService.exceptions.ServiceException;

public interface BookingService {

	BookingRequestDto addBookingToDB(BookingRequestDto bookingRequestDto) throws ServiceException;

	String deleteBookingFromDB(int bookingId) throws ServiceException;

	List<BookingRequestDto> getAllBookingFromDB();

}
