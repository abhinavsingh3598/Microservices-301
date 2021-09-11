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
@Table(name = "cast_crew")
@NoArgsConstructor
public class CastCrew {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int castCrewId;

	private String castCrewName;
	
	private String castCrewImage;
	
	@ManyToMany(fetch = FetchType.LAZY,mappedBy = "movieCastCrews", cascade = { CascadeType.DETACH, CascadeType.PERSIST, CascadeType.REFRESH,
			CascadeType.MERGE })
	private Set<Movie> movie;

	public CastCrew(String castCrewName, String castCrewImage) {
		super();
		this.castCrewName = castCrewName;
		this.castCrewImage = castCrewImage;
	}
	
	
}