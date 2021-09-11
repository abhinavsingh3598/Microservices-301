package com.mindtree.adminService.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter@Getter
@NoArgsConstructor
@EqualsAndHashCode(exclude="theater")
public class AddressRequestDto {

	private int addressId;
	private double  latitude;
	private double  longitude;
	private int pincode;
	private String city;
	private String country;
	private String streetName;
	private String landmark;
	@JsonIgnore
	private TheaterRequestDto theater;

}
