package com.mindtree.adminService.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@Entity
@Table(name = "theater")
@NoArgsConstructor
@EqualsAndHashCode(exclude="screens")
public class Theater {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int theaterId;
	private String theaterName;
	private String restrictions;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private Address address;

	@OneToMany(cascade = CascadeType.ALL,mappedBy = "screenTheater")
//	@JsonIgnore
	private Set<Screen> screens;
	
	@OneToMany(mappedBy = "screen")
	private Set<ShowScreenDetails> showScreenDetails;

	public Theater(String theaterName, String restrictions, Address address) {
		super();
		this.theaterName = theaterName;
		this.restrictions = restrictions;
		this.address = address;
	}
	
	
}