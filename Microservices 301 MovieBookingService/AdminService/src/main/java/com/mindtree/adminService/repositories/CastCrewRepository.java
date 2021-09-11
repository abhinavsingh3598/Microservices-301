package com.mindtree.adminService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.adminService.models.CastCrew;

@Repository
public interface CastCrewRepository extends JpaRepository<CastCrew, Integer> {

}
