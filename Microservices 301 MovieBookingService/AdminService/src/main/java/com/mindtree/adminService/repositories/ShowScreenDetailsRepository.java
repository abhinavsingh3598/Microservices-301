package com.mindtree.adminService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.adminService.models.ShowScreenDetails;

@Repository
public interface ShowScreenDetailsRepository extends JpaRepository<ShowScreenDetails, Integer> {

}
