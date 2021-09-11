package com.mindtree.userService.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@Entity
@NoArgsConstructor
@Table(name = "review")
public class Review {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reviewId;
	private double rating;
	private String reviewDescription;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	private int movieId;
	public Review(double rating, String reviewDescription, User user, int movieId) {
		super();
		this.rating = rating;
		this.reviewDescription = reviewDescription;
		this.user = user;
		this.movieId = movieId;
	}
	
	
	

}