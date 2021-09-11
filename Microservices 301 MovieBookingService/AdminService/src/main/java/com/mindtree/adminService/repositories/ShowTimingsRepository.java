package com.mindtree.adminService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.adminService.models.ShowTimings;

@Repository
public interface ShowTimingsRepository extends JpaRepository<ShowTimings, Integer> {

}
