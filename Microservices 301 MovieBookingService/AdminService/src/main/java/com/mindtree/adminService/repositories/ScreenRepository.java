package com.mindtree.adminService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.adminService.models.Screen;

@Repository
public interface ScreenRepository extends JpaRepository<Screen, Integer> {

}
