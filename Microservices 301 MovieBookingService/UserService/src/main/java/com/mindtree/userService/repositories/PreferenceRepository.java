package com.mindtree.userService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.userService.models.Preference;

@Repository
public interface PreferenceRepository extends JpaRepository<Preference, Integer> {

}
