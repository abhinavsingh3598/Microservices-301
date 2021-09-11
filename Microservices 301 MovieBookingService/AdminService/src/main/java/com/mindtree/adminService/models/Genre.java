package com.mindtree.adminService.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@Entity
@NoArgsConstructor
@Table(name = "genre")
public class Genre {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int genreId;
	
	private String genreType;
	
	@ManyToMany(fetch = FetchType.LAZY,mappedBy = "genres", cascade = { CascadeType.DETACH, CascadeType.PERSIST, CascadeType.REFRESH,
			CascadeType.MERGE })
	private Set<Movie> genreMovie;

	public Genre(String genreType) {
		super();
		this.genreType = genreType;
	}

	
	
	
}
