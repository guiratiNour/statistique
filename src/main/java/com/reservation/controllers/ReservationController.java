package com.reservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.reservation.service.ReservationService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/reservations")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping("/total")
    public ResponseEntity<Long> getTotalReservations() {
        Long totalReservations = reservationService.countTotalReservations();
        return ResponseEntity.ok(totalReservations);
    }
}

