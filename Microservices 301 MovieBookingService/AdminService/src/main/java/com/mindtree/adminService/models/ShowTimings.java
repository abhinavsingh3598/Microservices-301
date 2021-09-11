package com.mindtree.adminService.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Entity
@Table(name = "show_table")
public class ShowTimings {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int showId;
	
	private String showTimings;
	
	@OneToMany(mappedBy = "show")
	private Set<ShowScreenDetails> showScreenDetails;
}
