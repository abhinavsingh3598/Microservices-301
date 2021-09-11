package com.mindtree.adminService.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.mindtree.adminService.configs.StringListConverter;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "show_screen_details")
public class ShowScreenDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int showScreenDetailId;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "show_id")
	private ShowTimings show;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "screen_id")
	private Screen screen;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "movie_id")
	private Movie movie;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "theater_id")
	private Theater theater;

	private int totalSeatsPresent;
	@Column
	@Convert(converter = StringListConverter.class)
	private List<String> bookedSeats;
	
	

}