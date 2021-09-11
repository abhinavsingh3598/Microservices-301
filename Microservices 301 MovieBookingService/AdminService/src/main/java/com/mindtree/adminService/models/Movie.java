package com.mindtree.adminService.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "movie")
@NoArgsConstructor
public class Movie {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int movieId;
	private String movieName;
	private String moviePoster;
	private String movieDescription;
	private String budget;
	private String releaseDate;
	private String interestingfacts;
	private String language;
	
	

	public Movie(String movieName, String moviePoster, String movieDescription, String budget, String releaseDate,
			String interestingfacts, String language) {
		super();
		this.movieName = movieName;
		this.moviePoster = moviePoster;
		this.movieDescription = movieDescription;
		this.budget = budget;
		this.releaseDate = releaseDate;
		this.interestingfacts = interestingfacts;
		this.language = language;
	}

	@ManyToMany(fetch = FetchType.LAZY,cascade = { CascadeType.DETACH, CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.MERGE })
	@JoinTable(name = "movie_cast_crew", joinColumns = @JoinColumn(name = "movie_id"), inverseJoinColumns = @JoinColumn(name = "cast_crew_id"))
	private Set<CastCrew> movieCastCrews;
	@ManyToMany(fetch = FetchType.LAZY,cascade = { CascadeType.DETACH, CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.MERGE })
	@JoinTable(name = "movie_genre", joinColumns = @JoinColumn(name = "movie_id"), inverseJoinColumns = @JoinColumn(name = "genre_id"))
	private Set<Genre> genres;
	
	@OneToMany(mappedBy = "movie")
	private Set<ShowScreenDetails> showScreenDetails;
	
}
