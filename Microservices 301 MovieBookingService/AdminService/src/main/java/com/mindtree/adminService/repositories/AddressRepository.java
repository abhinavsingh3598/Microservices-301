package com.mindtree.adminService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.adminService.models.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
