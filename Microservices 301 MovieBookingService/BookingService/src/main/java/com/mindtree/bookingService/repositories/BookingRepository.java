package com.mindtree.bookingService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.bookingService.models.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {

}
