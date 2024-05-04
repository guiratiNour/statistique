package com.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    // Ici, vous pouvez ajouter des méthodes personnalisées si nécessaire
}
