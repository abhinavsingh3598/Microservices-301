package com.mindtree.bookingService.dtos;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BookingRequestDto {

	private int bookingId;
	private int userId;
	private String bookingType;
	private String bookingDate;
	private double amount;
	private String theatreName;
	private String movieName;
	private List<String> bookedSeats;
	private String modeOfPayment;
	private int show_screenId;
}
