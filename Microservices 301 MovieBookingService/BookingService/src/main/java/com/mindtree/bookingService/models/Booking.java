package com.mindtree.bookingService.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mindtree.bookingService.configs.StringListConverter;

import lombok.Data;

@Data
@Entity
@Table(name = "booking")
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingId;
	private int userId;
	private String bookingType;
	private String bookingDate;
	private double amount;
	@Column
	@Convert(converter = StringListConverter.class)
	private List<String> bookedSeats;
	private String modeOfPayment;
	private int show_screenId;

}