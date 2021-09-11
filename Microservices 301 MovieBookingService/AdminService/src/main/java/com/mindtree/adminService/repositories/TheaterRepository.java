package com.mindtree.adminService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.adminService.models.Theater;

@Repository
public interface TheaterRepository extends JpaRepository<Theater, Integer> {

}
