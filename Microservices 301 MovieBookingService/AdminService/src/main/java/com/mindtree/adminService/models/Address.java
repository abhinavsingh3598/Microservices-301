package com.mindtree.adminService.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Entity
@Table(name="address")
@EqualsAndHashCode(exclude="theater")
public class Address {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int addressId;
	private String  latitude;
	private String  longitude;
	private int pincode;
	private String city;
	private String country;
	private String streetName;
	private String landmark;
	@OneToOne(fetch = FetchType.LAZY,mappedBy = "address")
//	@JsonIgnore
	private Theater theater;

}
