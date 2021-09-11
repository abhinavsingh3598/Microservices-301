package com.mindtree.adminService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.adminService.models.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

}
