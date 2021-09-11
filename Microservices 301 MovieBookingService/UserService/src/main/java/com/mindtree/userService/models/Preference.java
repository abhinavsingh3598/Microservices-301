package com.mindtree.userService.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@NoArgsConstructor
@Entity
@Table(name = "preference")
public class Preference {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int preferenceId;
	private String language;
	private int genreId;

	//parent side mapped by 
	@OneToMany(mappedBy = "preference")
	private Set<User> users;
}
