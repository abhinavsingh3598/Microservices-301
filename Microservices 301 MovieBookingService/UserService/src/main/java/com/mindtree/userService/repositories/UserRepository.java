package com.mindtree.userService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.userService.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
