package com.mindtree.adminService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.adminService.models.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Integer> {

}
