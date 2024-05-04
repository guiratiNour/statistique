package com.reservation.entities;


import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;
import jakarta.persistence.*;

@Entity

public class Visitor {
	@Id
    private String id;

    @CreationTimestamp
    private LocalDateTime visitDate;

    // Constructors
    public Visitor() {
    }

    public Visitor(String id) {
        this.id = id;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDateTime visitDate) {
        this.visitDate = visitDate;
    }
}

