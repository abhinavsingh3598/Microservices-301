package com.mindtree.adminService.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@Entity
@Table(name = "screen")
@NoArgsConstructor
public class Screen {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int screenId;
	private String screenName;
	private int capacity;
	
	
	@ManyToOne(cascade = { CascadeType.DETACH, CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.MERGE })
	@JoinColumn(name = "theater_id")
	private Theater screenTheater;

	@OneToMany(mappedBy = "screen")
	private Set<ShowScreenDetails> showScreenDetails;

	public Screen(String screenName, int capacity, Theater screenTheater) {
		super();
		this.screenName = screenName;
		this.capacity = capacity;
		this.screenTheater = screenTheater;
	}

	
	
	
	
}